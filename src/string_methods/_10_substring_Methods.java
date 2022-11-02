package string_methods;

public class _10_substring_Methods {
    public static void main(String[] args) {


        String s= "TechGlobal";
        String s1 = s.substring( 4 );
        System.out.println(s1);

        //Get "Tech"

        System.out.println(s.substring (0,4));


        System.out.println(s.substring (2,15)); //out of bound exception

    }
}
