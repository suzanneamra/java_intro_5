package practice.ifElseStatements;

public class IfElsePractice {

    public static void main(String[] args) {
        int myInt =45;


        if (myInt >=0 && myInt<25){
            System.out.println("first quarter");
        }
        else if (myInt >=25 && myInt<=49){
            System.out.println("second quarter");
        }
        else if (myInt >=50 && myInt<=74){
            System.out.println("third quarter");
        }
          // ELSE IF WITH NEGATIVE NUMBERS


        if (myInt >=-50 && myInt<-1){
            System.out.println("number is in negative part");
        }
        else if (myInt == 0){
            System.out.println("zero");
        }
        else if (myInt >=1 && myInt<=50){
            System.out.println("number is in positive part");
        }



    }
}
