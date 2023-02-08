package Day4_01162023;

public class T4_ReturnMethodExample {
    public static void main(String[] args) {
        //declare a new variable called sumOfTwoNum
        int sumOfTwoNum = ReusableClass.returnSumOfTwoNumbers(9, 10);
        System.out.println("The sum from reusable method is " + sumOfTwoNum);
        int thirdNum = 100;
        int sumOfThreeNumbers = sumOfTwoNum + thirdNum;
        System.out.println("The sum of three numbers is " + sumOfThreeNumbers);

    }//end of main
}//end of class
