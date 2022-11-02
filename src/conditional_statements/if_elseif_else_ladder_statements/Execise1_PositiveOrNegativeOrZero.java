package conditional_statements.if_elseif_else_ladder_statements;

import java.util.Scanner;

public class Execise1_PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
Write a program that asks user to enter a number
if number is more than zero, print "POSITIVE"
if number is less than zero, print "NEGATIVE"
Otherwise, print "ZERO"

 */

        System.out.println("Please enter your number");
        int num = input.nextInt();

        if(num >0){
            System.out.println("Positive");
        }
        else if(num < 0){
            System.out.println("Negative");
        }
        else
            System.out.println("Zero");
        }


    }

