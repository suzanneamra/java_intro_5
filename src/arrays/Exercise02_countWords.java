package arrays;

public class Exercise02_countWords {
    public static void main(String[] args) {
        //Assume that you are given below string and count how many words you have in your String:

        String sentence = "I love arrays";

        System.out.println("\n------Solution 1 with toCharArray() method------\n");

        int countS = 0;

        for(char c : sentence.toCharArray()){
            if(c == ' ') countS++;
        }

        System.out.println(countS +  1);


        System.out.println("\n------Solution 2 with split() method------\n");

        System.out.println(sentence.split(" ").length); // 3






    }
}
