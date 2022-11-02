package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        String[][] students = {
                {"Ali", "Mehmet", "Alex"}, // line 0
                {"Alex", "Regina"},  //line 1
                {"Abdallah", "Newer"} //line 2
        };
//BAD WAY TO DO THIS< TOO SIMPLE
        System.out.println(students[0][1]); // Mehmet
        System.out.println(students[1][1]); //Regina

        System.out.println(students.length); //3

        System.out.println(Arrays.toString(students[0])); //Ali, Mehmet, Alex


//PRINTING INNER ARRAYS WITH FORI LOOP
        for (int i = 0; i < students.length; i++) {
            System.out.println(Arrays.toString(students[i]));

        }

        //PRINTING INNER ARRAYS WITH FOR EACH LOOP

        for(String[] group : students) {
            System.out.println(Arrays.toString(group));


            //PRINTING THE MULTI DIMENSIONAL ARRAY

            System.out.println(Arrays.deepToString(students));


        }


        for(String[] group : students){
            for(String student : group){
                System.out.println(student);
            }
        }



    }
}
