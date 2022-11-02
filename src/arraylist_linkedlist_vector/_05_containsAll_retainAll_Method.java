package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _05_containsAll_retainAll_Method {
    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<>();
        country.add("USA");
        country.add("Canada");
        country.add("Germany");
        country.add("Spain");
        country.add("Portugal");
        country.add("Sweden");



        if (country.contains("Denmark") && country.contains("Sweden")) System.out.println(true);
        else System.out.println("False");

        ArrayList<String> europeCountries = new ArrayList<>();
        europeCountries.add("Sweden");
        europeCountries.add("Spain");
        europeCountries.add("Germany");
        europeCountries.add("Portugal");

        System.out.println(country.containsAll(europeCountries));






    }

    }

