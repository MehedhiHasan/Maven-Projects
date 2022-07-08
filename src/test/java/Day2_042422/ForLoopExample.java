package Day2_042422;

import java.util.ArrayList;

public class ForLoopExample {
    public static void main(String[] args) {
        // create an arraylist for cities and loop/iterating all the values

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Bronx");
        cities.add("Manhattan");
        cities.add("Albany");

//       for(int i = 0; i < cities.size(); i++){
//
//           System.out.println("i is now " + i);
//           System.out.println(" My city is " + cities.get(i));
//
//       }// end of for loop

        int j = 0;
        while(j<cities.size()){
            System.out.println("sd");
            j++;
        }


        System.out.println(cities.size());
        System.out.println(cities.get(2));



    }// end of main
}// end of class
