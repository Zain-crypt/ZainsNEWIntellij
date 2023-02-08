package Day4_01162023;

import java.util.ArrayList;

public class T2_Loop_Conditional_String {
    public static void main(String[] args) {
        //define an array list of fruits
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apples");
        fruits.add("Oranges");
        fruits.add("Grapes");
        fruits.add("Bananas");
        //use for loop to iterate through the fruits array list
        for (int i = 0; i < fruits.size(); i++) {
            //only print bananas to the console
            //.equals  compares the content of the value
            //== compares the reference to the location of java memory
            //equalsignorecase will ignore the upper / lower case letters
            if (fruits.get(i).equalsIgnoreCase("BANAN2AS")){
                System.out.println("Go Bananas");
            }//end of clause
        }//end of for loop
    }//end of main
}//end of class
