package loops.control_statements;

public class Exercise03_PrintEvenNumbers {
    public static void main(String[] args) {
        /*
        Print all even numbers from 0-50
         */

        for (int i = 1; i <=50 ; i++) {
            if(i % 2 ==0) System.out.println(i);

        }
    }
}
