package Day2_042422;

import java.util.ArrayList;

public class actionItem1_1 {
    public static void main(String[] args) {

        // Creating an Arraylist for country String datatype
        ArrayList<String> country = new ArrayList<>();

        country.add("BD");
        country.add("USA");
        country.add("China");
        country.add("Korea");

        // Creating an Arraylist for countryCode Integer datatype
        ArrayList<Integer> countryCode = new ArrayList<>();

        countryCode.add(+880);
        countryCode.add(1);
        countryCode.add(3);
        countryCode.add(56);

        // Iterate through the country and countyCode using for loop  to print to the console

        for(int i = 0; i< country.size(); i++){

            System.out.println("My country is " + country.get(i) + " and My country code is " + countryCode.get(i));
            System.out.println(" countryCode is " + countryCode.get(i));
        }

    }// end of main method
}// end of java class
