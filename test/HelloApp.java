package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloApp {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();

        context.registerShutdownHook();
    }
}
