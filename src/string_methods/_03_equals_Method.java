package string_methods;

import java.sql.SQLOutput;

public class _03_equals_Method {
    public static void main(String[] args) {


        String s1 = "hello";
        String s2 = "java";
        String s3 = "Hello";

        boolean b1 = s1.equals(s2);   //you don't have to store this...do not do this! for boolean with string methods

        System.out.println(b1); //false

        System.out.println(s1.equals(s2)); //false -this way will work and you don't have to store the variable

        System.out.println(s1.equals(s3)); //False because hello and Hello are not the same

        System.out.println(s1.equalsIgnoreCase(s3));




    }
}
