package primitives;

public class Numbers {
    public static void main(String[] args) {
        /*
        There are 6 principles used to store numbers as data
        byte, short, int, long -> used to store absolute numbers like 3
        Float, double -> used for floating numbers like 10.5

        byte  -> 1 Byte
        short -> 2 bytes
        int   -> 4 bytes
        long  -> 8 bytes


        John
        his age > 45
        his balance -> 400.45
         */
        // dataType variableName = value; (data type=byte, variable=age, Name=number)

        System.out.println("ln----------Numbers - byte-short--------\n");
        byte age = 45;
        long favNumber = 2147483648L;

        System.out.println(age); // 45
        System.out.println(favNumber); // 150

        float balance1 = 23.87645F;
                double balance2 = 23.87635D;
                double price= 23.5;

        System.out.println(balance1); //23.87645
        System.out.println(balance2); //23.87635D
        System.out.println(price); //23.5

    }

}

