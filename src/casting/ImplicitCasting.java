package casting;

import sun.applet.Main;

public class ImplicitCasting {
    public static void main(String[] args) {


        byte b =25;  // Byte Range = -128 , 127
        int i = b;
        System.out.println(i);  //25

        float f = 10.5F;
        double d = f;

        System.out.println(d); //10.5

    }
}
