package casting;

public class Exercise4 {
    public static void main(String[] args) {
        // Converting Boolean into String Boolean True False

        System.out.println(true && false); //false
        //System.out.println("true" && "False"); compiler error

        System.out.println(String.valueOf(true) + String.valueOf(false)); //"true" + "false"
        System.out.println(String.valueOf("A") + 'a'); //"A" + 'a' ->Aa
        System.out.println("" + 10.5 + 5); //"10.55" + 5 -> 10.55

    }
}
