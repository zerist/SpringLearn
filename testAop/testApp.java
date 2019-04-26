package testAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("testBeans.xml");
        Student2 student = (Student2) context.getBean("student2");
        student.getName();
        student.getAge();
    }
}
