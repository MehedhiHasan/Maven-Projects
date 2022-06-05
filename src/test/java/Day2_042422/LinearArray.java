package Day2_042422;

public class LinearArray {

    public static void main(String[] args) {

// create string array for zipcode
        String [] zipCode = new String[]{"11213", "11412", "11323", "32432"};
        System.out.println("my zipcode is "+ zipCode[0] + " and the last zipcode is " + zipCode[2]);

// create int array for house number
        int[] houseNumber = new int[]{222,333,444,555};
        System.out.println("My first house number is " + houseNumber[0] + " and my 2nd house number is " + houseNumber[3]);

//printing the total number of the zipcode and house number
        System.out.println("The total number of the zipcode "+zipCode.length);
        System.out.println("The total number of the house "+houseNumber.length);

    }//end of main method

}// end of java class
