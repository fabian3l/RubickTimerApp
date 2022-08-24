package pl.lepsy.rubicktimerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pl.lepsy")
public class RubickTimerAppApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RubickTimerAppApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(RubickTimerAppApplication.class, args);
    }

}
