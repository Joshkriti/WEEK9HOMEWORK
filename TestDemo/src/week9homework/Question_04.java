package week9homework;

import java.util.ArrayList;

public class Question_04 {
    /*
    4. Write a Java program to iterate through all elements in an array list using
Iterator.
     */

    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();
        List.add("Volvo");
        List.add("BMW");
        List.add("Audi");
        List.add("Hyundai");

        for (String List1 : List){
            System.out.println(List1);
        }
    }
}
