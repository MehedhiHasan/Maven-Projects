package Day3_043022;

public class ActionItem2_02 {
    public static void main(String[] args) {

        String [] Cities = new String[]{"Brooklyn", "Queens", "Manhattan", "Staten"};

        // initiate integer value to i
        int i = 0;

        // iterate through the Linear Array to execute the Cities name only if it is Brooklyn or Manhattan
        while(i< Cities.length){

            // condition using or  operator (||)
            if(Cities[i] == "Brooklyn" || Cities[i] == "Manhattan"){
                System.out.println(" My city is " + Cities[i]);

            // incrementing i
                i++;
            } // end of condition
        }// end of while loop

    }// end of main
} // End of java
