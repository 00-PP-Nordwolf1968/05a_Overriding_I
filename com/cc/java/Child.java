package com.cc.java;

public class Child extends Parent{
        
    public String sayHello() {                  // nicht static, daher ausführung im objekt child
        return "Hello from Child";
        
    }
  
}    
   