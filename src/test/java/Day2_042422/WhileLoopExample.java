package Day2_042422;

public class WhileLoopExample {
    public static void main(String[] args) {
        // iterate through zipcode and house number using while loop and linear array

        String[] zipCodes = new String[]{"11111", "22222","33333","44444"};
        int[] houseNumber = new int[]{212,313,343,4234};

        // initialize your starting points before calling while loop
        int i = 0;

        //define the end point in while loop
        while(i<houseNumber.length){
            System.out.println("i is now " + i);
            System.out.println("my zip code is " + zipCodes[i] + " house number " + houseNumber[i]);

            // incrementing
            i ++;
            // i = i+1;
        }// end of while
    }// end of method
}// end of java class
