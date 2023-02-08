package Review_Materials;

public class Review_011923 {
    public static void main(String[] args) {
        //declare string variable
        String actionItem = "AI_05";
        //Requirement: As a professor, I would like to see the action item number only.
        //tips: use split to achieve this task

       //declare an array to split the message
        String[] arrayactionItem = actionItem.split("_");
       //print out only action item number
        System.out.println("The action item number is " + arrayactionItem[1]);
        //print out AI text
        System.out.println("The action item text is " + arrayactionItem[0]);

    }//end of main method
}//end of class
