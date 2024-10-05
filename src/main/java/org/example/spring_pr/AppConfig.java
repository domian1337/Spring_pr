package org.example.spring_pr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class AppConfig {


    @Bean (name = "helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloworld = new HelloWorld();
        helloworld.setMessage("Hello World");
        return helloworld;
    }

    @Bean (name = "cat")
    @Scope ("prototype")
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setName("Mew!");
        return cat;
    }
}
