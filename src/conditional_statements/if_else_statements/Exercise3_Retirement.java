package conditional_statements.if_else_statements;

import java.util.Scanner;

public class Exercise3_Retirement {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
/*
Write a Java program that asks user to enter their age
And print "It is your time to get retired!" if their age is more than or equal to 55
else calculate and tell user how many years later they can be retired

EXAMPLE PROGRAM 1
Program: Please enter your age?
User: 60

Program: It is your time to get retired!

EXAMPLE PROGRAM 1
Program: Please enter your age?
User: 45

Program: You have 10 years to be retired

 */
        System.out.println("Please enter you age");
        int age = input.nextInt();  ///This is for the user to enter their response

        if(age >= 65){
            System.out.println("It is your time to retire");

        }
        else{
            System.out.println("You have " + (65-age) + " years to retire.");

        }
    }

}
