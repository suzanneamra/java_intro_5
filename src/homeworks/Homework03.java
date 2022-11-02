package homeworks;

import java.util.Scanner;

public class Homework03 {
    /*
    Requirement:
-Write a Java program that asks user to enter 2 numbers
- int values and find the absolute difference between
the two numbers by using Math.abs() method

Test Data:
-5
27
Expected Output:
     */
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     int num1, num2;

     System.out.println("Please enter first number");
     num1 = input.nextInt();
     System.out.println("Please enter second number");
     num2 = input.nextInt();

     System.out.println("The difference between numbers is = " + Math.abs(num1 - num2));


     System.out.println("_________________TASK2__________________");

        /*
        Requirement:
-Write a Java program that asks user to enter 5 numbers
- int values and find the Max and Min number by using
Math.max() and Math.min() methods

Test Data:
3
15
45
20
25
Expected Output:
Max value = 45
Min value = 3
         */
     int num01, num02, num03, num04, num05;

     System.out.println("Please enter your first number");
     num01 = input.nextInt();
     System.out.println("Please enter your second number");
     num02 = input.nextInt();
     System.out.println("Please enter your third number");
     num03 = input.nextInt();
     System.out.println("Please enter your fourth number");
     num04 = input.nextInt();
     System.out.println("Please enter your fifth number");
     num05 = input.nextInt();


     System.out.println("Max Value = " + (Math.max(num01, Math.max(Math.max(num02, num03), Math.max(num04, num05)))));
     System.out.println("Min Value = " + (Math.min(num01, Math.min(Math.max(num02, num03), Math.min(num04, num05)))));


     System.out.println("_________________________TASK3__________________________________");

        /*
        Requirement:

        -Write a Java program that generates 3 random
        numbers between 50 and 100 both included. Use
        Math.random()
        First print the numbers
        Then, find the sum of these numbers

        Test Data:
        55
        67
        90
        Expected Output:
        Number 1 = 55
        Number 2 = 67
        Number 3 = 90
        The sum of numbers is = 212


         */
     int randomOne = (int) (Math.random() * (100 - 50 + 1) + 50);
     int randomTwo = (int) (Math.random() * (100 - 50 + 1) + 50);
     int randomThree = (int) (Math.random() * (100 - 50 + 1) + 50);

     System.out.println("Number 1 = " + randomOne);
     System.out.println("Number 2 = " + randomTwo);
     System.out.println("Number 3 = " + randomThree);

     System.out.println("The sum of the numbers is = " + (randomOne + randomTwo + randomThree));


     System.out.println("_________________________TASK4__________________________________");

        /*
        Assume Alex has $125, and Mike has $220.

                And Alex is going to give $25.5 to Mike.
        Then,
                How much money will Alex and Mike will have after
        that?
                Requirement:
                Write a java program to solve the problem given above
        Expected Output:
        Alex’s money: $99.5
        Mike’s money: 245.5

         */

     double mikeMoney = 220;
     double alexMoney = 125;

     double mikeMoneyAfter = mikeMoney + 25.5;
     double alexMoneyAfter = alexMoney - 25.5;
     System.out.println("Alex's money: $" + alexMoneyAfter);
     System.out.println("Mike's money: $" + mikeMoneyAfter);


     System.out.println("_________________________TASK5__________________________________");

        /*
        Assume David is going to save  $390 to buy a bicycle.
David can save only $15.60 per day.
Requirement:
Write a program to find how many days later, David can
save $390 and buy the bicycle.
Expected Output:
25
         */
     double davidDaily = 15.60;
     double davidSave = 390;

     System.out.println((int) (davidSave / davidDaily));

     System.out.println("_________________________TASK6__________________________________");

        /*
        Requirement:
Convert given Strings below to int data types and find
their sum, product, division, subtraction and remainder.
NOTE: Scanner is not needed for this task!
String s1 = “5”, s2 = “10”;
Expected results:
-Sum of 5 and 10 is = 15
-Product of 5 and 10 is = 50
-Division of 5 and 10 is = 0
-Subtraction of  5 and 10 is = -5
-Remainder of 5 and 10 is = 5
NOTE: expected results should exactly match!!!
         */
     String s1 = "5";
     String s2 = "10";
     int i1 = Integer.parseInt(s1);
     int i2 = Integer.parseInt(s2);

     System.out.println("Sum of 5 and 10 is = " + (i1 + i2));
     System.out.println("Product of 5 and 10 is = " + (i1 * i2));
     System.out.println("Division of 5 and 10 is = " + (i1 / i2));
     System.out.println("Subtract of 5 and 10 is = " + (i1 - i2));
     System.out.println("Remainder of 5 and 10 is = " + (i1 % i2));


     System.out.println("_________________________TASK7__________________________________");

        /*
        Requirement:
Convert given Strings below to int data types and find
the greatest and smallest values and find the average
and absolute difference of them.
NOTE: Scanner is not needed for this task!
String s1 = “200”, s2 = “-50”;
Expected results:
The greatest value is = 200
The smallest value is = -50
The average is = 75
The absolute difference is = 250
NOTE: expected results should exactly match!!
         */

     String s3 = "200";
     String s4 = "-50";
     int i3 = Integer.parseInt(s3);
     int i4 = Integer.parseInt(s4);

     System.out.println("The greatest value is = " + Math.max(i3, i4));
     System.out.println("The smallest value is = " + Math.min(i3, i4));
     System.out.println("The average is = " + (i3 + i4) / 2);
     System.out.println("The absolute difference is = " + Math.abs(i3 - i4));


     System.out.println("_________________________TASK8__________________________________");

        /*
        Requirement:

        Assume that you have a coin bank, and you save 3
        quarters, 1 dime, 2 nickels and 1 penny each day.
                NOTE: Scanner is not needed for this task!
        -find how many days later you can save $24
        -find how many days later you can save $168
        -how much you will save after 5 months (assume a
                month is 30 days)
        Expected results:
        25 days
        175 days
        $144.0
        NOTE: expected results should exactly match!!!
        */

     double quarter = 0.75;
     double dime = 0.10;
     double nickel = 0.10;
     double penny = 0.01;

     int daysToSave24 = (int) (24 / (quarter + dime + nickel + penny));
     int daysToSave168 = (int) (168 / (quarter + dime + nickel + penny));
     double savingsAfter5Months = (150 * (quarter + dime + nickel + penny));

     System.out.println(daysToSave24 + "days");
     System.out.println(daysToSave168 + "days");
     System.out.println(savingsAfter5Months);


     System.out.println("_________________________TASK9__________________________________");

     double computerPrice = 1250;
     double dailySaving = 62.5;
     int daysToComputer = (int) (computerPrice / dailySaving);
     System.out.println(daysToComputer);

     System.out.println("_________________________TASK10__________________________________");
        /*
        Requirement:
Dan is going to save $14,265 to buy a new car. Dan is given
two option to make monthly payments with no interest rate.
Option 1: Equal payments of $475.50 per month
Option 2: Equal payments of $951 per month
Write a Java program that calculates how many months it will
take for Dan to complete all the payments with option 1 and
option 2.
NOTE: Scanner is not needed for this task!
Expected Output:
Option 1 will take 30 months
Option 2 will take 15 months
NOTE: 15 or 30 months are int results and do not have any
floating point. So, it should not be 15.0 or 30.0 which are
double
NOTE: expected results should exactly match!!!
         */
     int totalSaving = 14265;
     double equalPayment1 = 475.50;
     int equalPayment2 = 951;

     System.out.println("Option 1 will take = " + totalSaving / (int) (equalPayment1) + " months");
     System.out.println("Option 2 will take = " + totalSaving / equalPayment2 + " months");

     System.out.println("\n____________________________________TASK11___________________________________________\n");
     /*
     Requirement:
Write a Java program that asks user to enter 2
numbers(number1 and number2) and store those in int
variables.
Find the result of number1/number2 and store this in a
double.
Finally print the result
Test data:
Number1 = 15
Number2 = 2
Expected Output:
7.5
NOTE: 7.5 is a double or float but you are asked to store
the result in a double. Make sure that your result is not
returning 7 instead of 7.5
      */

     System.out.println("Please enter a number");
     int num10 = input.nextInt();

     System.out.println("Please enter another number");
     int num11 = input.nextInt();

     System.out.println((num10 / (double) num11));


     System.out.println("\n____________________________________TASK12___________________________________________\n");

          /*
          Requirement:
Write a Java program that generates 3 random numbers
between 0 and 100 (0 and 100 are included) and find if
all numbers are more than 25
Print true if all numbers are greater than 25
Print false if any of the number is less than or equal to
25
           */


     int ran1 = (int) (Math.random() * (100 - 0 + 1) + 0);
     int ran2 = (int) (Math.random() * (100 - 0 + 1) + 0);
     int ran3 = (int) (Math.random() * (100 - 0 + 1) + 0);

     /*
     System.out.println(ran1);
     System.out.println(ran2);  //do this to see the random numbers
     System.out.println(ran3);
     */

     if (ran1 > 25 && ran2 > 25 && ran3 > 25) {
      System.out.println("true");
     } else
      System.out.println("false");

     System.out.println("\n____________________________________TASK13___________________________________________\n");


     //Requirement:
     //     Write a Java program to ask user to enter a number
     //     between 1 to 7 (1 and 7 are included)
     //     Print the day of the week according to given number.
     //     First day is MONDAY and last day is SUNDAY
     //     Test data 1:
     //     Input number: 3
     //     Expected Output:
     //     The number entered returns WEDNESDAY
     //     Test data 2:
     //     Input number: 5
     //     Expected Output:
     //     The number entered returns FRIDAY

     System.out.println("Hey User, please enter a number between 1 and 7");
     int weekDay = input.nextInt();
     if (weekDay == 1) {
      System.out.println("MONDAY");
     } else if (weekDay == 2) {
      System.out.println("TUESDAY");
     } else if (weekDay == 3) {
      System.out.println("WEDNESDAY");
     } else if (weekDay == 4) {
      System.out.println("THURSDAY");
     } else if (weekDay == 5) {
      System.out.println("FRIDAY");
     } else if (weekDay == 6) {
      System.out.println("SATURDAY");
     } else if (weekDay == 7) {
      System.out.println("SUNDAY");
     }


     System.out.println("\n____________________________________TASK14___________________________________________\n");

     //Jennifer is taking a math course . This math course requires
     //students to take 3 exams. At the end, if the average of
     //those exams is more than or equal to 70, then Jennifer will
     //pass the course. However, if the average of those 3 exams
     //is less than 70, then Jennifer will fail.
     //Requirement:
     //Write a Java program that asks Jennifer to enter her exam
     //results and print if she passed or failed for the exam.
     //Example Program 1:
     //Program: Tell me your
     //exam results?
     //User: 20 50 85
     //Program: YOU FAILED!
     //Example Program 2:
     //Program: Tell me your
     //exam results?
     //User: 65 80 90
     //Program: YOU PASSED!


     System.out.println("Tell me your exam results");
     int exam1 = input.nextInt();
     int exam2 = input.nextInt();
     int exam3 = input.nextInt();

     input.nextLine();

     int average = (exam1 + exam2 + exam3) / 3;

     if (average >= 70) {
      System.out.println("YOU PASSED!");
     } else {
      System.out.println("YOU FAILED!");
     }

     System.out.println("\n____________________________________TASK15___________________________________________\n");

     //Requirement:
     //Write a Java program that asks user to enter 3 numbers
     //-If all numbers are different, then print “NO MATCH”
     //-If any of those 2 numbers are equal, then print
     //“DOUBLE MATCH”
     //-If all 3 numbers are equal, then print “TRIPLE MATCH”
     //Example Program 1:
     //Program: Enter 3
     //numbers
     //User: 3 3 3
     //Program: TRIPLE MATCH
     //Example Program 2:
     //Program: Enter 3
     //numbers
     //User: 5 4 5
     //Program: DOUBLE
     //MATCH
     //Example Program 3:
     //Program: Enter 3
     //numbers
     //User: 2 5 7
     //Program: NO MATCH


     System.out.println("Please enter 3 numbers");
     int number96 = input.nextInt();
     int number97 = input.nextInt();
     int number98 = input.nextInt();
     if (number96 == number97 && number96 == number98) {
      System.out.println("Triple match");
     } else if (number96 == number97 || number96 == number98 || number97 == number98) {
      System.out.println("Double match");
     } else {
      System.out.println("No match");


     }
    }
}
