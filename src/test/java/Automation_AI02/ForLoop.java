package Automation_AI02;

import java.util.ArrayList;
public class ForLoop {
    public static void main(String[] args) {
        //declare list of countries
        ArrayList<String> cities = new ArrayList<>();
        //add value for cities
        cities.add("Brooklyn"); //index 0
        cities.add("Manhattan"); //index 1
        cities.add("Queens"); //index 2
        cities.add("Staten Island");//index 3
        //state loop to print cities
        for (int i= 0; i < cities.size(); i++) {
            //print out i value for iteration number
            System.out.println("iteration is now: "+ i);
            //print out all city names
            System.out.println("The city is "+ cities.get(i));
        }//end of loop
    }//end of main
}//end of class
