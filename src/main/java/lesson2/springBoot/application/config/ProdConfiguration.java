package lesson2.springBoot.application.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
//@PropertySource("classpath:application.properties")
@Profile("prod")
public class ProdConfiguration {
    @Bean
    public int state(@Value("${mynum}") int i) {
        return i;
    }
}
