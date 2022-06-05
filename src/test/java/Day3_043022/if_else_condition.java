package Day3_043022;

public class if_else_condition {
    public static void main(String[] args) {


        //declare two integer variables

        int a = 3;
        int b = 3;
        int c = 6;

        // print when a is less than b or print a is greater or equal to b

        if(a+b < c) System.out.println("a&b is less than c");
        else if(a+b > c)System.out.println("a&b is greater than c");
        // for multiple true/false executing we have to use &&, || operator
//        else if(a == b)System.out.println("a is equal to b");
        else System.out.println("a+b is equal to c");

        // end of if else condition

    }// end of main method
}//end of java class
