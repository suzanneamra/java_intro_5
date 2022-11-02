package Operators.increment_decrement_operators;

public class PreIncrementVsPostIncrement {
    public static void main(String[] args) {
        //post-increment
        int num1 = 5;

        num1++; //increases by one but assign it later = 5

        System.out.println(num1); //6

        //pre-increment
        int num2 = 5;

        ++num2; // increase it by ine adn assign it now  -> num2 =6

        System.out.println(num2);

        //understanding teh difference
        byte b1=5, b2=5;


        System.out.println(b1++);
        System.out.println(++b2);

    }
}
