package Day2_010923;

public class T1_LinearArray {
    public static void main(String[] args) {
        //declare a string array variable
        String[] zipCode;
        //store some zipcode values in the zipCode array
        zipCode = new String[]{"11218", "11230", "11255", "11467"};
        //print out the first item from the array
        System.out.println("My first zipcode is " + zipCode[0]);
        //print out the third item from the array
        System.out.println("My third zipcode is " + zipCode[2]);


        //declare int array variable
        int[] studentGrades = new int[]{75, 80, 90, 95, 99, 100};
        //print out the number 100 which is stored at index 5
        System.out.println("Printing out the 6th int value" + "" + studentGrades[5]);
    }//end of main method
}//end of class
