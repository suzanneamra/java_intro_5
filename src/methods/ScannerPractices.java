package methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class ScannerPractices {
  public static void main(String[] args) {


    /*
    Write a program that asks user to enter their name adn then age and print the info in below format

    {name}'s age is {age}.
     */

  String name = ScannerHelper.getAName();

    System.out.println("The name is = " + name);


int age = ScannerHelper.getAnAge();

System.out.println("The age is = " + age);


    String address = ScannerHelper.getAnAddress();

    System.out.println("The Address is = " + address);

    /*
    OR DO IT THIS WAY
     */



}
}
