package Day3_043022;

public class ActionItem02_01 {
    public static void main(String[] args) {

        // assign a grading value
        int grade = 159;

        // generating grades using conditions
        if(grade >=90 && grade <=100) {
            System.out.println("grade is A");
        }
        else if(grade >=80 && grade <90){
            System.out.println("grade is B");
        }
        else if(grade >=70 && grade <80){
            System.out.println("grade is C");
        }
        else if(grade >=60 && grade <70){
            System.out.println("grade is D");
        }
        else if (grade <60){
            System.out.println("grade is F");
        }
        else System.out.println("This is not Grade, it is more than 100");
    }// end of main method
}// end of java class
