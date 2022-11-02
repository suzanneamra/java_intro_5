package loops.while_loops;

public class UnderstandingWhileLoop {
    public static void main(String[] args) {

        //print numbers from 1 to 10

        System.out.println("\n _____________________fori loop_________________");
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i);

        }

        System.out.println("\n _____________________while loop_________________");

        int start = 1;

        while(start <= 10){
            System.out.println(start);
            start++;
        }
    }
}
