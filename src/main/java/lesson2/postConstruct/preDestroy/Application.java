package lesson2.postConstruct.preDestroy;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Application implements BeanPostProcessor {
    public Application() {
        System.out.println("Создание");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("после конструктора");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("сейчас произойдет удаление");
    }

    @Override
    public String toString() {
        return "Строковое представление класса";
    }
}
