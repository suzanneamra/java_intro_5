package practice.ifElseStatements;

import java.util.Scanner;

public class IfElseRandomPractice {
    public static void main(String[] args) {
//if else solution
        int random = (int) (Math.random() * (50 - 0 + 1) + 0);
        System.out.println("My random number is = " + random); //used so we can see the random number

        if (random >= 10 && random <= 25) {
            System.out.println("true");

        } else
            System.out.println(false);

        //Ternary Solution
        System.out.println((random >= 10 && random <= 25) ? "true" : "false");


        System.out.println("\n_____________________________TASK2___________________________\n");

        int randomOne = (int) (Math.random() * (100 - 1 + 1) + 1);

        System.out.println("My random number is = " + randomOne);

        if (randomOne >= 1 && randomOne <= 25) {
            System.out.println(randomOne + "is in the 1st quarter");

        } else if (randomOne >= 26 && randomOne <= 50) {
            System.out.println(randomOne + "is in the 2nd quarter");

        } else if (randomOne >= 51 && randomOne <= 75) {
            System.out.println(randomOne + "is in the 3rd quarter");

        } else if (randomOne >= 76 && randomOne <= 100) {
            System.out.println(randomOne + "is in the 4th quarter");

        }
        if (randomOne >= 1 && randomOne <= 50) {
            System.out.println(randomOne + "is on the 1st half");
        } else if (randomOne >= 51 && randomOne <= 100) {
            System.out.println(randomOne + "is in the 2nd half");
            {
                //Instructors way!
                int mySecondRandom = (int) (Math.random() * (100 - 1 + 1) + 1);

                if (mySecondRandom <= 50){
                    //1-50
                    System.out.println("1st half");
                    if (mySecondRandom <= 25){
                        System.out.println("1st quarter");
                    }else{
                        System.out.println("2nd quarter");
                    }
                }else{
                    System.out.println("2nd half");

                    if (mySecondRandom <= 75){
                        System.out.println("3rd quarter");
                    }else{
                        System.out.println("4th quarter");
                    }

                    //
                    Scanner input = new Scanner(System.in);

                    System.out.println("Hey User, Is it raining?");
                    boolean isRaining = input.nextBoolean();

                    System.out.println("Hey User, Do you have an umbrella?");
                    boolean hasUmbrella = input.nextBoolean();

                    System.out.println("Hey User, are you hungry?");
                    boolean isHungry = input.nextBoolean();


                if (isRaining){
                    System.out.println("it is raining outside!");
                    if (hasUmbrella){
                        System.out.println("you can go outside.");
                    }else{
                        System.out.println("you stay home.");
                        if (isHungry){
                            System.out.println("you can go to Chick-Fil-A");
                        }
                    }

                }

                }

            }
        }
    }
}