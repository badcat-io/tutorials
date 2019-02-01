package io.badcat.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.badcat.bean.Message;

public class Application {
    
    public static void main(String[] args) {
        
       ApplicationContext context = new ClassPathXmlApplicationContext("my-beans.xml");
 
       Message obj = (Message) context.getBean("mymessage");
 
       String msg = obj.getMessage();
       System.out.println(msg);
    }
 }