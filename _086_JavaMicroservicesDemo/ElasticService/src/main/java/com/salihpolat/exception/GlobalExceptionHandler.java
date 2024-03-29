package com.salihpolat.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Tüm controller sınıfları için merkezi bir şekilde hata yönetimi sağlayan anotasyondur.
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    private ErrorMessage createErrorMesaj(ErrorType errorType, Exception exception) {

        System.out.println("Hata Oluştu: " + exception.getMessage());

        return ErrorMessage.builder()
                .code(errorType.getCode())
                .message(errorType.getMessage())
                .build();
    }

    /**
     * ExceptionHandler: Uygulama içinde oluşacak hatanın türünü verdiğimiz şekilde yakalanmasını sağlar.
     * ResponseBody: Dönüş tipimizin formatının Json olmasını sağlar.
     *
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<String> handleException(Exception e) {
        // log tutabilirsin, db'e kayıt işlemleri...
        return ResponseEntity.badRequest().body("Uygulamada Bad Request Gerçekleşti..." + e.getMessage());
    }

    @ExceptionHandler(ElasticServiceException.class)
    @ResponseBody
    public ResponseEntity<ErrorMessage> handleSatisException(ElasticServiceException e) {

        ErrorType errorType = e.getType();

        HttpStatus httpStatus = errorType.getStatus();

        return new ResponseEntity<ErrorMessage>(createErrorMesaj(errorType, e), httpStatus);
    }
}