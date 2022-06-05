package Day3_043022;

import ReuseableLibraries.ReusableMethods;

public class TestingMethods {

    public static void main(String[] args) {

        ReusableMethods.addTwoNumbers(20,30);
//        ReusableMethods.addTwoNumbers(40,30);
//        ReusableMethods.addTwoNumbers(70,30);

        // call the return method and store it in a variable to perform something else

        int finalResult = ReusableMethods.subtractTwoNumbers( 30, 20);
        int newResult = finalResult+10;
        System.out.println("new result is  " + newResult);

    }// end of main method

}//end of java class
