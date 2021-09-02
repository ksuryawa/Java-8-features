package com.ksuryawa.java8features.FunctionalInterface;

@FunctionalInterface
interface MyFunctionalInterfaceWithAnnInnerClass {
    public abstract void myMethod();
}

class MainClass {
    public static void main(String[] args) {
        //Write Anonymous inner class to implement method of MyFunctionalInterfaceWithAnnInnerClass (FunctionalInterface)

        MyFunctionalInterfaceWithAnnInnerClass myFunctionalInterfaceWithAnnInnerClass = new MyFunctionalInterfaceWithAnnInnerClass() {
            @Override
            public void myMethod() {
                System.out.println("In Functional Interface With Anonymous Inner class");
            }
        };

        //call myMethod
        myFunctionalInterfaceWithAnnInnerClass.myMethod();

    }
}
