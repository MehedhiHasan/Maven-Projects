package Day3_043022;

import java.util.ArrayList;

public class practice_loop {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        car.add("M");
        car.add("r");
        car.add("g");
String[] city = new String[]{"Bronx","Brokklyn","Queens"};
        for(int i =0; i< car.size();i++){

//            System.out.println(car.size() + car.get(2));
//            System.out.println(city.length + city[1]);


            if(car.get(i) =="M"|| city[i] == "Bronx"){
                System.out.println(car.size() +"\n" +car.get(0)+"\n" + city.length+"\n" + city[0]);
            }



        }



     }
}
