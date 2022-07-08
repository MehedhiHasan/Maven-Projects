package Day3_043022;

import java.util.ArrayList;

public class loop_conditions {
    public static void main(String[] args) {

      // create an array of fruits

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Strawberry");

        for (int i =0; i< fruits.size(); i++){

//            if(fruits.get(i) == "Apple"){
//                System.out.println("My fav fruit is  " + fruits.get(i));
//            } else if (fruits.get(i) == "Orange"){
//                System.out.println(" my fav fruit is " + fruits.get(i));
//            }

            if(fruits.get(i) == "AppLe"|| fruits.get(i) == "Orange"){
                System.out.println("my fav fruit is " + fruits.get(i));
            }


        }// end of loop

    }// end of main method
}// end of java class
