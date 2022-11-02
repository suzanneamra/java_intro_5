package strings;

public class PracticeConcatenation {
    public static void main(String[] args) {
        /*
        Task-1
        String wordPart1 = "le";
        String wordPart1 = "ar";
        String wordPart1 = "ning";


         */
        String wordPart1 = "le";
        String wordPart2 = "ar";
        String wordPart3 = "ning";
        String word = wordPart1 + wordPart2 + wordPart3;
        System.out.println( word);

        /*
        Task 2- Use cocat method
        String sentencePart1 = "I can";
        String sentencePart2 = "learn Java";
       String fullName = sentencePart1 + "" + sentencePart2

         */
        String sentencePart1 = "I can";
        String sentencePart2 = " learn Java";
        String fullName = sentencePart1.concat(sentencePart2);
        System.out.println(fullName);

    }
}
