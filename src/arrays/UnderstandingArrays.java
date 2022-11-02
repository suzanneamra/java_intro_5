package arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {



        String[] names = {"Beyza", "Andrii", "Vlad", "Samir", "Olena"}; // holds a collection of names

        //retrieving an element from an array - using index
        System.out.println(names[2]); //vlad

        System.out.println(names[3]); // Samir


        // ArrayIndexOutOfBoundsException 0-4, names start with 0 and end with 4- there are 5 names but start with 0
        // System.out.println(names[6]);
        // System.out.println(names[-1]);

        int [] ages = {21, 23, 25};
        System.out.println(ages [2]); //25



    }
}
