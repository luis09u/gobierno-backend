package com.gobierno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        // Esta línea es la que enciende el motor de Spring Boot y el servidor web
        SpringApplication.run(Main.class, args);
        System.out.println("=========================================================");
        System.out.println("🚀 SERVIDOR GOBIERNO TI (TOYOTA) INICIADO EN EL PUERTO 9000");
        System.out.println("=========================================================");
    }
}