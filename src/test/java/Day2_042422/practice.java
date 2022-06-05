package Day2_042422;

import java.util.ArrayList;

public class practice {
    public static void main(String[] args) {
//
//        ArrayList<String> jil =  new ArrayList<>();
//        jil.add("sdf");
//        jil.add("asdf");
//        jil.add("afadfa");

//         ArrayList<Integer> mil = new ArrayList<>();
//        mil.add(345);
//        mil.add(34523);
//        mil.add(34535);
////



        // Create an ArrayList with multiple data types

        ArrayList<Object> multipleDataTypes = new ArrayList<>();

        multipleDataTypes.add("Web Automation");
        multipleDataTypes.add(556);
        multipleDataTypes.add(2.2);

        for(int i = 0; i< multipleDataTypes.size(); i++){
            System.out.println(multipleDataTypes.get(i));
        }

        // Create a Linear array with multiple data Types
        Object[] linearData = new Object[]{"Manual Testing", 33, 2.3};

        for(int i = 0; i< linearData.length; i++){
            System.out.println(linearData[i]);
        }

//
//        System.out.println(jil.get(0) + mil.get(1));
//
//        for(int i = 0; i< mil.size(); i++)
//            System.out.println(jil.get(i) + " " + mil.get(i));

//
//        int i =0;
//        while(i< mil.size()){
//            System.out.println("string  " + jil.get(i) +" integer "+  mil.get(i));
//            i++;
//        }




       //  linear array
//        String[] hil = new String[]{"a", "b", "c"};
////        int[] gil = new int[]{1,2,3,4};
//
//        for (int i = 0; i<hil.length; i++){
//            System.out.println("linear array integer " + hil[i] + " , string  " + jil.get(i));
//        }

//        int i = 0;
//        while(i< hil.length){
//            System.out.println(hil[i] + gil[i]);
//            i++;
//        }
//
//        for(int i = 0; i< gil.length; i++)
//            System.out.println(hil[i] + " " + gil[i]);




    }// end of main method
}// End of java class

// for arrayList we can add whatever number of value we want. but linear array length is fixed.
// also for printing arraylist we must use .get() method & for linear we must use [i] method .