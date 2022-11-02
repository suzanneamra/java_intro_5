package projects;

import sun.applet.Main;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {
        /*
        -1
-Write a program that asks user to enter their 3 numbers
-Then multiply these numbers and print the result in the format:
The product of the numbers entered is =
{number1}*{number2}*{number3}

EXAMPLE PROGRAM
Program: Please enter 3 numbers
User: 3 6 10
Program: The product of the numbers entered is = 180
         */
        System.out.println("__________________________TASK 1_____________________________________________");
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Please enter 3 number");

        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();

        System.out.println("The product of the number entered is = " + num1 * num2 * num3 );

        System.out.println("\n");

        System.out.println("__________________________TASK 2_____________________________________________");

        /*
        TASK-2
          -Write a program that asks user to enter their first name, last name and year of
        birth.
                -Then calculate the age by subtracting the year of birth from current year we are in.
                -Print result in the format: {firstName} {lastName}’s age is = {currentYear}
– {yearOfBirth}.
        EXAMPLE PROGRAM
        Program: What is your first name?
                User: Jennifer
        Program: What is your last name?
                User: Worley
        Program: What is your year of birth?
        User: 1993
        Program: Jennifer Worley’s age is = 29.

         */
        String firstName, lastName;
        int yearOfBirth;

        System.out.println("Please enter your first name" );
        firstName=scanner.next();

        System.out.println("Please enter your last name" );
        lastName=scanner.next();

       scanner.nextLine();

        System.out.println("Please enter your year of birth" );
        yearOfBirth= scanner.nextInt();

        System.out.println(firstName + " " + lastName + " " + "age is" + " " + (2022 - yearOfBirth));



        System.out.println("__________________________TASK 3_____________________________________________");





    }
}
