package org.example.spring_pr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
        System.out.println(helloWorld.getMessage());
        HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloworld");
        Cat cat1 = (Cat) context.getBean("cat");
        Cat cat2 = (Cat) context.getBean("cat");
        System.out.println(helloWorld2 == helloWorld);
        System.out.println(cat1 == cat2);
    }
}
