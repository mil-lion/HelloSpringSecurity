package ru.lionsoft.hello.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import ru.lionsoft.hello.spring.security.controller.HomeController;

@SpringBootApplication
@ComponentScan(basePackageClasses = HomeController.class)
public class Run {

    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
    }

}
