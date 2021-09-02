package com.ksuryawa.java8features.FunctionalInterface;

@FunctionalInterface
public interface MyFunctionalInterfaceWithLambda {
    public abstract void myMethod();

    default void Display() {
        System.out.println("In Default ...");
    }

    static void StaticMethod() {
        System.out.println("In Static...");
    }
}

class MainLambdaClass {
    public static void main(String[] args) {
        MyFunctionalInterfaceWithLambda myFunctionalInterfaceWithLambda = () ->
        {
            System.out.println("In Functional Interface With Lambda Expression");
        };

        myFunctionalInterfaceWithLambda.myMethod();
        myFunctionalInterfaceWithLambda.Display();
    }
}
