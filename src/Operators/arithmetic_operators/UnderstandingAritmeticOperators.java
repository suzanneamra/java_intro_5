package Operators.arithmetic_operators;

public class UnderstandingAritmeticOperators {
    public static void main(String[] args) {
        /*
        Find the result of below expressions
        3 +5
        5 - 2
        10 / 2
        2 * 4
        10 % 3
         */

        System.out.println(3 + 5);
        System.out.println(5 - 2);
        System.out.println( 10 / 2);
        System.out.println( 2 * 4 );
        System.out.println(10 % 3);

        /*
        create two int variables called as num1 and num2
        and store 6 and 4 in these variables respectively find their
        sum
        subtraction
        product
        division
        remainder
         */
        int Num1 = 6;
        int Num2 = 4;

        System.out.println( " The sum of numbers is = " + (Num1 + Num2) ); // when you want to add a sentence
        // add additional parenthesis on the math problem if it is addition or subtraction or it will concatenate
        // i.e, num1 and mum2 would have been 64 without the (), it would not add or sub, just will put them together.
        System.out.println( Num1 - Num2 );
        System.out.println( Num1 * Num2 );
        System.out.println( Num1 / Num2 );
        System.out.println( Num1 % Num2 );




    }
}
