package arrays;

import java.util.Arrays;

public class SearchingInAStringArray {
    public static void main(String[] args) {
        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};

/*
TASK-1
Check the collection you have above and print true if it contains Mouse
Print false otherwise

RESULT:
true
*/

        boolean hasM = false;
        for(String object : objects){
            if(object.equals ("Mouse")){
                hasM =true;
                break;
            }
        }
        System.out.println(hasM);




        System.out.println("-----------------------Binary Search-------------------------------------------");
        Arrays.sort(objects);
        System.out.println(Arrays.binarySearch(objects, "Mouse")>= 0);







    }
}
