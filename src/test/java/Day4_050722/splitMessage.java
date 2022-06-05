package Day4_050722;

public class splitMessage {
    public static void main(String[] args) {

        String splitText = "My name is Jhon";

        // declare of array to store the string split
        String[] splitTextArray = splitText.split(" ");

        System.out.println(" My first name is " + splitTextArray[3]);

//practice
//        String splitText2 = "His name is Jhoni";
//        String[] splitTextArray2 = splitText2.split(" ");

//        for(int i =0; i<splitTextArray2.length; i++){
//            System.out.println(splitTextArray2[i]);
//        }


      //  System.out.println(" My first name is  " + splitTextArray2[0]);
//        System.out.println(splitText2.split(" "));

    }// end of main
}// end of java class
