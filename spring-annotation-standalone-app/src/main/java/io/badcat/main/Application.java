package io.badcat.main;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import io.badcat.bean.Message;

@ComponentScan(basePackages = "io.badcat")
public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        Application p = context.getBean(Application.class);
        String[] beanNames = context.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        p.start();
        
    }

    @Autowired
    private Message message;

    private void start() {
        System.out.println("Message: " + message.getMessage());
    }
}