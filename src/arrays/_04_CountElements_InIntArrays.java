package arrays;

public class _04_CountElements_InIntArrays {
    public static void main(String[] args) {

        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};

        //How many negatives: 2
        //How many Positives: 5
        //How many neutrals or zeros: 3
        //How many evens: 6
        //How many odds: 4
        // max: 10
        // min: -7
        //sum of all the numbers: 28
        //how many of these numbers are represented in fibonacci sequences: 6
        //how many unique numbers: 7
        //prime numbers:2
        //how many numbers can be divided by 5: 6
        //absolute difference between the  max and min: 17
        // Closest number to 9(take the smallest of you have 2): 8

        int negatives = 0;

        for (int number : numbers) {
            if (number < 0) negatives++;

        }

                System.out.println("Negative count = " + negatives);


        int positives = 0;
        for (int number : numbers) {
            if (number > 0) positives++;

        }

        System.out.println("Positive count = " + positives);



/*
Count how many even numbers you have

EXPECTED:
6
 */
        System.out.println("\n_____________For i solution____________________");
        int even1 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) even1++;
        }

        System.out.println(even1);



        System.out.println("\n_____________For each solution____________________");


        int evens = 0;
        for (int number : numbers) {
            if (number %2 ==0 ) evens++;

        }

        System.out.println(evens);




    }

        }


