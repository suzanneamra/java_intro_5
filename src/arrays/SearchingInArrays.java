package arrays;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {

        int[] numbers = {3,5,8,10};

        //search for 7 and return true if it exists in this array, return false otherwise->false
        boolean has7 = false;
        for(int number : numbers){
            if(number ==7)
                has7 =true;
            break;
        }
        System.out.println(has7);



        boolean has5 = false;
        for(int number : numbers){
            if(number ==5){
                has5 =true;
            break;
        }
    }
        System.out.println(has5);

        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println(Arrays.binarySearch(numbers, 10));
        System.out.println(Arrays.binarySearch(numbers, 9));



    }
}
