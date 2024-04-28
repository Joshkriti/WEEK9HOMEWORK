package week9homework;

import java.util.ArrayList;

public class Question_03 {

    /*
    3. Write a Java program to create a new array list, add some colours(string) and
printout the collection using for each loop.
     */

    public static void main(String[] args) {
        coloursName();
    }

    public static void coloursName(){
        ArrayList<String> coloursName = new ArrayList<>();
        coloursName.add("Pink");
        coloursName.add("White");
        coloursName.add("Black");
        coloursName.add("Orange");
        coloursName.add("Purple");
        System.out.println(coloursName);

        System.out.println("------------------------");

        for (int i = 0; i <coloursName.size(); i++){
            System.out.println(coloursName.get(i));
        }

        System.out.println("--------------------------");

        for (String name: coloursName){
            System.out.println(name);

        }
    }


}
