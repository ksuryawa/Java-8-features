package com.ksuryawa.java8features.LambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
    public static void main(String[] args) {
        /*Comparator<String> comparator=new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return Integer.compare(str1.length(),str2.length());
            }
        };*/

        Comparator<String> comparator = (str1, str2) ->
                Integer.compare(str1.length(), str2.length());

        List<String> arrayList = Arrays.asList("****", "*", "***", "**");
        Collections.sort(arrayList, comparator);

        for (String s : arrayList) {
            System.out.println(s);
        }

    }
}
