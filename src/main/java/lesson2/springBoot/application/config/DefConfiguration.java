package lesson2.springBoot.application.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("def")
public class DefConfiguration {
    @Bean
    public int state(@Value("${mynum}") int i) {
        return i;
    }
}
