package arrays;

public class DeclaringAnArray {
    public static void main(String[] args) {


        //Declare an array "THESE ARE ALL DECLARATIONS"
        String[] countries;
        int[] numbers;
        char[] characters;
        double[] doubles;
        boolean[] booleans;

        // initialization - Assignment with size only
         countries = new String[3];
         numbers = new int[5];
         characters = new char[4];
         doubles = new double[4];
         booleans = new boolean[4];

         //Default Values for array elements
        System.out.println(countries[0]); // null (objects )
        System.out.println(numbers[0]); // 0- it is default for byte-short-int-long
        System.out.println(characters[0]); // nothing
        System.out.println(booleans[0]); // False
        System.out.println(doubles[0]); // 0.0


    }
}
