package conditional_statements.ternary_operator;

public class UnderstandingTernary {
    public static void main(String[] args) {
        //F -> for female - Jane
        //M -> for Male -> John
        //? mean if , : means else

        char gender = 'M';

        String name = gender == 'F'  || gender == 'f' ? "jane"  :  "john";
        System.out.println (name);

    }
}
