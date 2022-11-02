package casting;

public class ExplicitCasting {
    public static void main(String[] args) {
        //Explicit Casting- narrowing- down-casting

        int age = 25;

        byte b =(byte) age;

        System.out.println(b);

        int num1 = 5000;
        byte num2 =(byte) num1;

        System.out.println(num2);
    }
}
