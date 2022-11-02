package conditional_statements;

import java.util.Random;

public class Exercise2_FindMin {
    public static void main(String[] args) {
        /*
        Write a program that generates 2 random numbers bt 1 and 10
         Find and print the smallest number
         */

        int randomOne = (int) (Math.random() * (10-1+1) +1);
        int randomTwo = (int) (Math.random() * (10-1+1) +1);

        System.out.println("Random 1 = " + randomOne);
        System.out.println("Random 2 = " + randomTwo);

        int min = randomOne < randomTwo ? randomOne : randomTwo;
        int max = randomOne > randomTwo ? randomOne : randomTwo;

        System.out.println("The smallest number is " + min);
        System.out.println("The largest number is " + max);
    }
}
