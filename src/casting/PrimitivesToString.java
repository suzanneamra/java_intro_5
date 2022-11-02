package casting;

public class PrimitivesToString {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        System.out.println(num1 + num2);  //15 (primitive because it added the
        System.out.println("" + num1 + num2); //510 (becamee a string cuz of the quotes, it concatenated)-> string-text
        System.out.println("" + (num1 + num2)); // 15 ->string-textsout

        System.out.println(String.valueOf(num1) + String.valueOf(num2)); //510

        System.out.println(String.valueOf(23) + 5); // 235 -> the value is 23 as a string + 5 (it concatenates)






    }
}
