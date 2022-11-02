package loops.do_while_loops;

import java.util.Scanner;

public class Exercise02_GetNumberDividedBy5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 1;

        do{
            if (count == 1) System.out.println("Please enter a number");
            else System.out.println("Please enter a new number");
            number = scanner.nextInt();
            if (number % 5 !=0) System.out.println("This number is not dividable by 5");
            count++;
        }
        while(number % 5 !=0);

        System.out.println("This number is dividable to 5");
    }
}
