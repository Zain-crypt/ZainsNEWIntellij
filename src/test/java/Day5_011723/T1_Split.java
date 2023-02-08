package Day5_011723;

public class T1_Split {
    public static void main(String[] args) {

        //print the keyword John from the string message
      String message = "My name is John";

      //create an array variable in order to split the single string message
        String[] arrayMessage = message.split(" ");
        //print john which is index 3
        System.out.println("value is " + arrayMessage[3]);


    }//end of main method
}//end of class
