package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("I am a Constructor");
    }
    abstract void greet();
}
class Child1 extends Parent{
    void greet(){
        System.out.println("Good Morning");
    }
}

abstract class Child2 extends Parent{
    void none(){
        System.out.println("none");
    }
}
public class T53_abstract_class_methods {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
//        Parent p = new Parent();  -----> error
    }
}
