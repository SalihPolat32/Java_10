package com.salihpolat;

import com.salihpolat.service.MessageProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:applicationContext.xml"})
public class Application {

    private static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        log.info("Uygulama Başladı..");

        // SpringApplication.run(Application.class, args);

        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        MessageProcessor messageProcessor =  applicationContext.getBean(MessageProcessor.class);

        messageProcessor.processingMsg("Selamlar, nasılsın?");

        log.info("Uygulama Bitti..");
    }
}