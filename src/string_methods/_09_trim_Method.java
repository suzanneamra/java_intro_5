package string_methods;

public class _09_trim_Method {
    public static void main(String[] args) {

        String s1 = "  Hello   ";

        System.out.println(s1.length()); // 10
        s1 = s1.trim();
        System.out.println(s1.trim().length()); // 5

        System.out.println(s1); // Hello
        System.out.println(s1.length()); // 5

        /*
        -return type
        -returns a String
        -non-static
        -it does not take any argument
                */
        String s2 = "  Hello   ";

        System.out.println(s2.length()); // 10
        s1 = s2.trim();

        System.out.println(s2); // "Hello"
        System.out.println(s2.length()); // 5


        System.out.println("  Hello World   .".trim());





















    }


}
