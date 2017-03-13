package com.samuel;

/**
 * Created by Samue on 2017/3/13.
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();

        buffer.append("hello").append(" world").append(" welcome");
        String s = buffer.toString();

        System.out.println(buffer);
        System.out.println(s);

        buffer.append(true).append(false).append(1).append(2.22);
        System.out.println(buffer);
        System.out.println("-----------");

        int a = 100;
        int b = 200;
        String s1 = "abc";
        boolean bo = true;

        System.out.println(a + b + s1 +bo);



    }
}
