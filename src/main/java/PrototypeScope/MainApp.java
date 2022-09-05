package PrototypeScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA = (HelloWorld) applicationContext.getBean("helloWorldP");

        objA.setMessage("I'm Object A");
        objA.getMessage();

        HelloWorld ObjB = (HelloWorld)  applicationContext.getBean("helloWorldP");
        ObjB.getMessage();

    }

}
