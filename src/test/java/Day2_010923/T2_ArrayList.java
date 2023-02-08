package Day2_010923;

import java.util.ArrayList;

public class T2_ArrayList {
    public static void main(String[] args) {
        //declare an array list of countries
        ArrayList<String> countries = new ArrayList<>();
        //add values for countries
        countries.add("USA"); //index 0
        countries.add("PAKISTAN"); //index 1
        countries.add("INDIA"); //index 2
        countries.add("BANGLADESH"); //index 3
        //print out USA and INDIA from the countries arraylist
        System.out.println("Countries first value is " + countries.get(1) + " countries third value is "+  countries.get(2));
        //get the total size of the countries array
        System.out.println("The size of the countries array list is " +  countries.size());
    }//end of main

}//end of class
