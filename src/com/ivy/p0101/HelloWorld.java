package com.ivy.p0101;

/**
 * Created by ivy on 2017/8/18.
 */
public class HelloWorld {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        System.out.println("hello:"+name);
        return name;
    }
}

class main{
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("ivy");
        helloWorld.sayHello();
    }
}