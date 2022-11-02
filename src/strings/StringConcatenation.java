package strings;

public class StringConcatenation {
    public static void main(String[] args) {
        //Declaration
        String city;

        //Assignments
        city = "Berlin"; // "" = empty space

        //Re-assignment
        city = "Seattle";

        System.out.println(city);

        System.out.println( "The city I live in is " + city + ".");

        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;

        System.out.println(s1 + " " + s2);

        // 1st way to concat:


        // Create 2 strings to store your firstName and lastName
            // Then concat them with a 3rd string called as fullname

        String firstName = "Suzanne";
        String lastName = "Amra";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);


        // 2nd way to concat:

        String fullName2 = firstName.concat(lastName);
        System.out.println(fullName);
    }
}
