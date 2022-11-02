package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _10_forEach {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Red", "Brown", "Pink", "Yellow", "Black"));


        System.out.println(colors);
        System.out.println(colors.size());

        for(String color : colors) {
            System.out.println(color);
        }
    }


}
