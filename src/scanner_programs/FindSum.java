package scanner_programs;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {
        // 1. declare variable
        //


        int num1, num2, num3;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1: ");
        num1 = input.nextInt();

        System.out.println("Please enter number 2: ");
        num2 = input.nextInt();

        System.out.println("Please enter number 2: ");
        num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("The sum of the number you entered is = " + sum);


    }
}
