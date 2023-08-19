package com.salihpolat.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {

    MUSTERI_BULUNAMADI(1003, "Aradığınız Müşteri Sistemde Kayıtlı Değil!!!", NOT_FOUND),
    URUN_EKLEME_HATASI(2001, "Ürün Ekleme Başarısız Oldu!!!", INTERNAL_SERVER_ERROR),
    INVALID_PARAMETER(3001, "Geçersiz Parametre Girişi Yaptınız!!!", HttpStatus.BAD_REQUEST),

    REGISTER_PASSWORD_MISMACTH(4001, "Girilen Parolalar Eşleşmedi!!!", HttpStatus.BAD_REQUEST),
    REGISTER_USERNAME_EXISTS(4002, "Geçersiz Parametre Girişi Yaptınız!!!", HttpStatus.BAD_REQUEST),

    LOGIN_USERNAME_OR_PASSWORD_NOT_EXISTS(5001, "Girilen Kullanıcı Adı Veya Parola Hatalı!!!", HttpStatus.BAD_REQUEST),

    INVALID_TOKEN(6001, "Girilen token Geçersiz!!!", HttpStatus.BAD_REQUEST);

    private int code;

    private String message;

    private HttpStatus status;
}