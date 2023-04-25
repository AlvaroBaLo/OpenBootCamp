package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Saludo saludo = (Saludo) context.getBean("Saludo");
        String hi= saludo.imprimirSaludo();
        System.out.println(hi);
    }
}