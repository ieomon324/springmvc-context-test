package net.javaguides.springmvc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ServingWebContentApplication {

    public static void main(String[] args) {
    	System.setProperty("server.servlet.context-path", "/springmvc");
        SpringApplication.run(ServingWebContentApplication.class, args);
    }

}
