package week9homework;

import java.util.ArrayList;

public class Question_05 {
    /*
    5. Write a Java program to test an array list is empty or not. Define array list with
underground tube names
     */

    public static void main(String[] args) {
        tubeNames();

    }

    public static void tubeNames(){
        ArrayList<String> tubeNames = new ArrayList<>();
        tubeNames.add("Bakerloo");
        tubeNames.add("Central");
        tubeNames.add("Circle");
        tubeNames.add("Victoria");
        System.out.println(tubeNames);

        boolean cha = tubeNames.isEmpty();
        if (cha == true)
            System.out.println("Array list is empty");
        else
            System.out.println("Array list is not empty");





    }
}
