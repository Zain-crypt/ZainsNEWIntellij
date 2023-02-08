package Automation_AI02;

public class Whileloop {
    public static void main(String[] args) {
        //string Array variable
        String[] cities;
        cities = new String[] {"Brooklyn", "Manhattan", "Queens", "Staten Island"};
        //print out first item from list
        System.out.println("my first city is" + " " + cities[0]);
        //set initializer
        int i =  0;
        //set up while loop
        while (i < cities.length){
            //print statement
            System.out.println("My cities are" + " " + cities[i]);
            //increment or it will cause infinite loop
            //i++ or i= i+1
            i= i+1;
        }//end of while loop
    }//end of main
}//end of class
