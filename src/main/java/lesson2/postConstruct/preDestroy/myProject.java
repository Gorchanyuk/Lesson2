package lesson2.postConstruct.preDestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myProject {
    public static void main (String[] args){
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("lesson2");
        Application app = context.getBean("application", Application.class);
        System.out.println(app);
        context.close();
    }
}
