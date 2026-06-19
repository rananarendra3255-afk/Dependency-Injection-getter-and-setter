package depndency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        ClassDI obj = (ClassDI) context.getBean("stdid1");

        obj.display();
    }
}