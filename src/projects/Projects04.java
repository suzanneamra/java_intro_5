package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Random;
import java.util.Scanner;

public class Projects04 {
    public static void main(String[] args) {
        System.out.println("\n----------------------------------Task 1----------------------------\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Hey User, enter a string");

        String str = input.nextLine();


        if (str.length() < 8) {
            System.out.println("This string does not have 8 characters");
        } else {
            System.out.println(str.substring(str.length() - 4) + str.substring(4, str.length() - 4) + str.substring(0, 4));

        }


        System.out.println("\n----------------------------------Task 2----------------------------\n");

        String str1 = input.nextLine();

        System.out.println("Hey user, Please enter a sentence ");

        if (str1.contains(" ")) {
            System.out.println(str1.substring(str1.lastIndexOf(" ") + 1) + str1.substring(str1.indexOf(" "), str1.lastIndexOf(" ") + 1) + str1.substring(0, str1.indexOf(" ")));
        } else {
            System.out.println("This sentence does not have 2 or more words to swap");


            System.out.println("\n--------------------------------TASK 3-----------------------------------\n");

            System.out.println("Hey user, Please enter a sentence ");

            String str2 = input.nextLine();


            System.out.println(str2.replace("stupid", "nice").replace("idiot", "nice").replace("idiot", "nice"));


            System.out.println("\n--------------------------------TASK 4-----------------------------------\n");

            System.out.println("Hey user, Please enter your name ");

            String str3 = input.nextLine();

            if (str3.length() < 2) {
                System.out.println("Invalid Input");
            } else if (str3.length() % 2 == 0) {
                System.out.println(str3.length() / 2 - 1);
            } else if (str3.length() % 2 == 1) ;


            System.out.println("\n--------------------------------TASK 5-----------------------------------\n");

            System.out.println("Please enter a country");
            String str4 = input.nextLine();
            if (str4.length() < 5) {
                System.out.println("Invalid Input");
            } else if (str4.length() >= 5) {
                System.out.println(str4.substring(2, str4.length() - 2));
            }

        }


        System.out.println("\n--------------------------------TASK 6-----------------------------------\n");

        System.out.println("Please enter your address");
        String address = input.nextLine();

        System.out.println(address.replace('A', '*').replace('a', '*').replace('E', '#').replace('e', '#').replace('I', '+').replace('i',
                '+').replace('U', '$').replace('u', '#').replace('O', '@').replace('o', '@'));


        System.out.println("\n--------------------------------TASK 7-----------------------------------\n");

        int num1 = (int) (Math.random() * 25), num2 = (int) (Math.random() * 25);
        String Bucket = "";

        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i % 5 != 0) {
                Bucket += i + " - ";

            }
        }
        System.out.println(Bucket.substring(0, Bucket.length() - 3));


        System.out.println("\n--------------------------------TASK 8-----------------------------------\n");
        System.out.println("Please enter a sentence");


        String sentence = input.nextLine();
        int counter = 1;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                counter += 1;
            }
        }
        if (!sentence.contains(" ")) {
            System.out.println("This does not have multiple words");
        } else {
            System.out.println("This sentence has " + counter + " words");


        }


        System.out.println("\n--------------------------------TASK 9-----------------------------------\n");

        System.out.println("Please enter a positive number");
        int PosNum = input.nextInt();


        for (int i = 1; i <= PosNum; i++) {
            if (i % 2 == 0 & i % 3 == 0) {
                System.out.println("FooBar");
            } else if (1 % 2 == 0) {
                System.out.println("Foo");

            } else if (i % 3 == 0) {
                System.out.println("Bar");
            } else {
                System.out.println(i);


            }


        }


    }
}













