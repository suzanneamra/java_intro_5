package mathClass;

import java.util.Scanner;

public class MinAndMaxWithScanner {
    public static void main(String[] args) {
        // Get 2 numbers from user and find ther max and min and rpint them wit jmessage
        // output:
        //"Hey user give me a number"
        //input ->10
        //Hey user give me another number
        //-> 15
        //max of your number is 15
        //Min of your munber is 10
        //In orde to aska user for anythkng you have to create a scanner

       Scanner scanner =  new Scanner(System.in);

        System.out.println("Hey user give me a number");
        int num1 = scanner.nextInt();

        System.out.println("Hey user give me a number");
        int num2 = scanner.nextInt();

        System.out.println("Your first number is =" + num1);
        System.out.println("Your first number is =" + num2);

        System.out.println("Max of you number is " + Math.max(num1, num2));
        System.out.println("Min of you number is " + Math.min(num1, num2));



        // Get 3 numbers from user and find ther max and min and rpint them wit jmessage
        // output:
        //"Hey user give me a number"
        //input ->10
        //"Hey user give me another number"
        //-> 15
        //"Hey user give me the last number"
        //input ->20
        //max of you rnumber is 20
        //Min of your munber is 10
        //In orde to aska user for anythkng you have to create a scanner

        System.out.println("Hey user give me a number");
        int num11 = scanner.nextInt();

        System.out.println("Hey user give me another number");
        int num22 = scanner.nextInt();

        System.out.println("Hey user give me the last number");
        int num33 = scanner.nextInt();


        System.out.println("Your first number is =" + num11);
        System.out.println("Your second number is =" + num22);
        System.out.println("Your last number is =" + num33);

        System.out.println("Max of your number is " + Math.max(num11, num22));
        System.out.println("Min of your number is " + Math.min(num11, num22));



    }
}
