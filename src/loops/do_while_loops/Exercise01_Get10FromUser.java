package loops.do_while_loops;

import java.util.Scanner;

public class Exercise01_Get10FromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 1;

        do{
            if (count == 1) System.out.println("Please enter a number");
            else System.out.println("Please enter a new number");
            number = scanner.nextInt();
            if (number < 10) System.out.println("This number is more than or equal to 10");
            count++;
        }
        while(number < 10);

        System.out.println("This number is more than or equal to 10");


    }
}
