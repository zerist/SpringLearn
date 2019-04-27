package testTransaction;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("testTransaction/transaction.xml");
        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
        System.out.println("-------------Record creattion--------");
        studentJDBCTemplate.create("xzas", 23, 99, 2010);
        studentJDBCTemplate.create("xpli", 29, 88, 2010);
        studentJDBCTemplate.create("aya", 21, 100, 2010);

        System.out.println("-----------Listiing all the records------");
        List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();
        for (StudentMarks record: studentMarks){
            System.out.print("id: " + record.getId());
            System.out.print(" name: " + record.getName());
            System.out.print(" marks: " + record.getMarks());
            System.out.print(" year: " + record.getYear());
            System.out.print(" age: " + record.getAge());
        }
    }
}
