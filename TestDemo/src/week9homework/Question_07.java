package week9homework;

import java.util.HashMap;

public class Question_07 {
    /*
    7. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
     */

    public static void main(String[] args) {
        HashMap<Integer, String> people = new HashMap<>();
        people.put(21, "Prisha");
        people.put(24, "Krisha");
        people.put(29, "Mishta");

        System.out.println(people);

        for (Integer a : people.keySet()){
            System.out.println(a);
        }

        for (String b : people.values() ){
            System.out.println(b);
        }
    }



}
