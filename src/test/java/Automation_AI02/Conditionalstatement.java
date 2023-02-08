package Automation_AI02;

public class Conditionalstatement {
    public static void main(String[] args) {
        //stating int variable
        int grade = 59;
        //conditional statements
        if (grade > 90 && grade <= 100) {
            System.out.println("grade is A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("grade is B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("grade is C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("grade is D");
        } else {
            System.out.println("grade is F");
        }//end of conditional statements
    }//end of main
}//end of class
