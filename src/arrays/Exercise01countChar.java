package arrays;

public class Exercise01countChar {
    public static void main(String[] args) {
        /*
        assume you are given a string as below

        String word = "Java";

        Count how many letter 'a' you have in a String
         */

        String word = "Java";

        int countA = 0;

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)=='a') countA++;
        }

        System.out.println(countA);

//-------------------------For each string method______________________________

        String words = "Java"; // [J, a, v, a]

        int countB = 0;

        for(char element : word.toCharArray()){
            if(element == 'a') countB++;
        }

        System.out.println(countB);

    }
}
