package string_methods;

import java.util.Arrays;

public class _16_split_Method {
    public static void main(String[] args) {

        String s = "Today is Sunday and teh weather is nice";

        String[] arr1 = s.split(" "); //Today, is,  Sunday, and, teh, weather, is, nice

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(s.split("is")));
    }
}
