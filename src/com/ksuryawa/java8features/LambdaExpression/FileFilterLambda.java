package com.ksuryawa.java8features.LambdaExpression;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {
    public static void main(String[] args) {
        System.out.println("**************** Without Lambda Function ****************");
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        };

        File dir = new File("/Users/kapilsuryawanshi/src/CoreJava/src/org/jbk/jbk1002");

        File[] files = dir.listFiles(fileFilter);


        for (File f : files) {
            System.out.println(f);
        }

        System.out.println("**************** With Lambda Function ****************");

        FileFilter fileFilter1 = (File pathName1) -> pathName1.getName().endsWith(".java");

        File dir1 = new File("/Users/kapilsuryawanshi/src/CoreJava/src/org/jbk/jbk1002");

        File[] files1 = dir1.listFiles(fileFilter);


        for (File f : files1) {
            System.out.println(f);
        }
    }
}
