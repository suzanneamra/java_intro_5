package conditional_statements.if_else_statements;

import java.util.Scanner;

public class ShortIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
Write a program that asks user to enter 2 different numbers
And the greatest number and print it with a message as below

EXAMPLE PROGRAM
Program: Please enter 2 numbers
User: 5 10

Program: 10 is the greatest

NOTE: Do not use Math class
 */
        System.out.println("Please enter 2 different numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 > num2) System.out.println(num1 + " is the greatest");

        else System.out.println(num2 + " is the greatest");

    }

    }
