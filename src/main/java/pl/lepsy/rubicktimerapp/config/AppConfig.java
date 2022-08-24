package pl.lepsy.rubicktimerapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pl.lepsy.rubicktimerapp.algorithms.pll.PllConverter;

@Configuration
public class AppConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(getPllConverter());
    }
    @Bean
    public PllConverter getPllConverter(){
        return new PllConverter();
    }

}
