package dj.poc.spring.security.ldap.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * Created by agrawald on 8/7/17.
 */
@SpringBootApplication
@EnableWebSecurity
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
