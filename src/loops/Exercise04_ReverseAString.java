package loops;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise04_ReverseAString {
    public static void main(String[] args) {

        String name= ScannerHelper.getAName();

        String reversedName = "";

        for (int i = name.length()-1; i >=0 ; i--) {
            reversedName += name.charAt(i);
        }
        System.out.print("The reversed name is = " + reversedName );

    }
}
