package br.com.db1.passwordmeter.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.db1.passwordmeter")
public class PasswordMeterApplication {

    public static void main(String[] args) {
        SpringApplication.run(PasswordMeterApplication.class, args);
    }
}

