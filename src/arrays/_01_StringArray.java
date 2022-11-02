package arrays;

import java.util.Arrays;

public class _01_StringArray {
    public static void main(String[] args) {

        //1. Declare a String array called as countries and assign size of 3

        String[] countries = new String[3];

        //2. assigning values to specific indexes
        countries[1] = "Spain";
        countries[2] = "Belgium";

        //3. Print specific index from an array
        System.out.println(countries [0]);  //null
        System.out.println(countries [1]);  //Spain
        System.out.println(countries [2]);  //Belgium

        //4. Printing an array

        System.out.println( Arrays.toString(countries));

        //5. update existing element: just reassign the value so countries[1] was originally Spain, now its France
        countries[1] = "France";
        System.out.println(Arrays.toString(countries));

        //6. Getting the length of an array - how many elements -3
        System.out.println(countries.length); //3

        //7. Printing each element seperately (iterating the array)

        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }


    }
}
