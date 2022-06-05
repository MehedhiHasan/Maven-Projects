package Day2_042422;

public class actionItem1_2 {
    public static void main(String[] args) {

        // Creating String and Integer linear Array
        String[] region = new String[]{"Dhaka", "Chittagong", "Sylhet", "Noakhali"};
        int[] areaCode = new int[]{212,313,343,234};

        // Iterate through the Linear Arrays using while loop.................


        int i = 0;
        while( i< region.length){

            System.out.println("My region is " + region[i] + " and My areaCode is " + areaCode[i]);

            i++;
        }
    }// End of main method
}// End of java class
