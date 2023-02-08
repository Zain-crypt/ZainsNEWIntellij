package Day4_01162023;

    public class ReusableClass {
        //start of void method example
        public static void sumOfTwoNumbers(int num1, int num2) {
            //the beginning of the method body
            //this is where we define the operation that the method will execute
            int result = num1 + num2;
            System.out.println("The result from reusable method is " + result);
        }//end of sumoftwonum method

        //start of return method example
        public static int returnSumOfTwoNumbers(int num1, int num2) {
            //the beginning of method body
            //this is where we define the operation that the method will execute
            //this method will return the sum
            int result = num1 + num2;
            System.out.println("The result from reusable method is " + result);
            return result;
        }//end of return sum method
    }//end of class

