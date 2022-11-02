package mathClass;

import java.util.Scanner;

public class AbsoluteMethod {

    public static void main(String[] args) {
        System.out.println("Difference between your numbers is =" + Math.abs(10-14));
        System.out.println("Difference between your numbers is =" + Math.abs(14-10));
        System.out.println("Difference between your numbers is =" + (10-14));

        Scanner scanner =  new Scanner(System.in);

                System.out.println("Please enter an age");
                int age1 = scanner.nextInt();

                System.out.println("Please enter another age");
                int age2 = scanner.nextInt();

        System.out.println("Difference between your age is =" + Math.abs(age1-age2));
        System.out.println("Biggest sge" + Math.max (age1, age2));
        System.out.println("Smallest sge" + Math.min (age1, age2));









    }
}
