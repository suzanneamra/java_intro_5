package scanner_programs;

public class _12_contains_Method {
    public static void main(String[] args) {

        String s = "TechGlobal School";

        System.out.println(s.contains("Tech")); //true
        System.out.println(s.contains("School")); //true
        System.out.println(s.contains("a")); //true
        System.out.println(s.contains("d")); //false


        //Important

        System.out.println(s.contains ("")); //true
        System.out.println(s.contains ("s")); //true
        System.out.println(s.contains ("Education")); //false






















    }
}
