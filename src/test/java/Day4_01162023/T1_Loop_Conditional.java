package Day4_01162023;

import java.util.ArrayList;

public class T1_Loop_Conditional {
    public static void main(String[] args) {
        //declare integer array list for student grades
        ArrayList<Integer> studentGrades = new ArrayList<>();
        //add some grades to the student grades list
        studentGrades.add(96); //index 0
        studentGrades.add(86); //index 1
        studentGrades.add(76); //index 2
        //index 3 does not exist
        //for loop to iterate through the array list
        for (int i = 0; i < studentGrades.size(); i++) {
                 //print only if grade is 86
                //|| is called the OR operator in java (one of the conditions need to be true in order for it to execute)
                //&& is called the and operator in java ( both of the conditions need to be true in order for it to execute)
                if (studentGrades.get(i) == 76 || studentGrades.get(i) == 96) {
                    //print only grade 86
                    System.out.println("the student grade is " + studentGrades.get(i) + " A or B");
                }//end of if clause
        }//end of for loop
    }//end of main


}//end of class
