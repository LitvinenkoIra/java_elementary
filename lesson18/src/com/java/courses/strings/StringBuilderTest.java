package com.java.courses.strings;

public class StringBuilderTest {

    public static void main(String[] args) {

        //Strings
        String str = "";
        for (int i = 0; i < 10; i++) {
            str += i;
        }
        System.out.println(str);
        //-------------------------

        System.out.println();

        //String Builder
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            builder.append(i);
        }
        System.out.println(builder.toString());
        //-------------------------
    }
}
