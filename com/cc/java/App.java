package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
       Child child = new Child();
       output(child.sayHello());
       output(child.sayHello("Karsten"));

    }

    private static void output(String outputStr) {          // static, daher ausführung in klasse
        System.out.println(outputStr);
    }


}

