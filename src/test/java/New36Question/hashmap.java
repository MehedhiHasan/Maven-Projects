package New36Question;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        HashMap<String,Integer> cityCountry = new HashMap<String,Integer>();

        cityCountry.put("BD",1);
        cityCountry.put("India",2);
        cityCountry.put("USA",3);
        cityCountry.put("Pol",4);
        System.out.println(cityCountry);
        System.out.println(cityCountry.size());
        System.out.println(cityCountry.get("BD"));

        for(String i: cityCountry.keySet()){
            System.out.println(i);
        }
        for(int i: cityCountry.values()){
            System.out.println(i);
        }
    }
}
