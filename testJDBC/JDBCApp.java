package testJDBC;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import testJDBC.StudentJDBCTemplate;
public class JDBCApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("testJDBC/testJDBC.xml");
        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
        System.out.println("--------Record Creation--------");
        studentJDBCTemplate.create("zara", 11);
        studentJDBCTemplate.create("haha", 23);
        studentJDBCTemplate.create("auay", 14);

        System.out.println("-------------Listing Multiple Records---------");
        List<Student> students = studentJDBCTemplate.listStudents();
        for(Student record : students){
            System.out.print("id: " + record.getId());
            System.out.print(" name: " + record.getName());
            System.out.println(" age: " + record.getAge());
        }

        System.out.println("---------update Record whit id=2 ----------");
        studentJDBCTemplate.update(2, 20);

        System.out.println("----------list Record with id=2------------");
        Student student = studentJDBCTemplate.getStudent(2);
        System.out.print("id: " + student.getId());
        System.out.print(" name: " + student.getName());
        System.out.println(" age: " + student.getAge());
    }
}
