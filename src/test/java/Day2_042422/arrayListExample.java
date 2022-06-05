package Day2_042422;

import java.util.ArrayList;

public class arrayListExample {
    public static void main(String[] args) {
        // create an ArrayList for countries

        ArrayList<String> countries = new ArrayList<>();

        countries.add("USA"); // index 0
        countries.add("BD");
        countries.add("India");
        countries.add("Spain");
        countries.add("Pakistan");

        // printing 4th value of the list

        System.out.println("My last country is "+ countries.get(4) + " and my first country " + countries.get(0));



    }// end of main method
}// end of java class
