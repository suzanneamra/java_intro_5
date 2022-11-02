package mathClass;

public class MinAndMaxMethods {

    public static void main(String[] args) {


        int maxNumber = Math.max(80, 27); //80

        int maxNumber2 = Math.max(maxNumber, 125);
        int maxNumber3 = Math.max(maxNumber2, 625);

        System.out.println("max number = " + maxNumber); //80
        System.out.println("max number = " + maxNumber2); //80
        System.out.println("max number = " + maxNumber3); //80


        int minNumber = Math.min(80,27);
        int minNumber2 = Math.min(Math.min(80,27), 2);


        System.out.println("\nminNumber = " + minNumber);
        System.out.println("\nminNumber = " + minNumber2);



        int minOfTwoNeg = Math.min (-40, -60);

        double maxOfTwoDecimals = Math.max(1.7, 6.5);

        System.out.println();

        /*
        Find the max value of the given numbers and print them
        * 6,9  //9
        * 17,49   //49
        * 34.2, 12.5  //34.2
        * -14, -32    //-14
        * 17, 49, 125  //125
        * 45,32,56,89
         */

        int max1 = Math.max (6, 9); //create the variable and save it this way to store for future use
        System.out.println("Max Value = "+ Math.max(6, 9)); //fast way to calculate if I don't need it again,
        // cant go back to ity
        int max2 = Math.max (17, 49);

        System.out.println("\n\nTask for Class");
        System.out.println(Math.max(6,9));

        System.out.println("Min Value =" + Math.min(6,9));
        System.out.println("Min Value =" + Math.min(17,49));
        System.out.println("Min Value =" + Math.min(34.2, 12.5));
        System.out.println("Min Value =" + Math.min(-14, -32));
        System.out.println("Min Value =" + Math.min(Math.min(17, 49), 125));
        System.out.println("Min Value =" + Math.min(Math.min(Math.min(45, 32), 56), 89));



    }
}
