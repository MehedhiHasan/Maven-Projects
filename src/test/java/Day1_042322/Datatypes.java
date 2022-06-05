package Day1_042322;

public class Datatypes {

    public static void main(String[] args) {
        // declare string variable with some values

        String myVariables, myVariables2;
        myVariables = "welcome to class";
        myVariables2 = "welcome to class";

        // declare integer

        int myNumber, zipcode;
        myNumber = 202;
        zipcode = 11417;
        //print the values with concatenation
        System.out.println("You guys " + myVariables + " my number is " + myNumber + " " + myVariables2 + " " + zipcode);
       // System.out.println($DATE$ + $TIME$);
        System.out.println(java.time.LocalDate.now());
    }

}
