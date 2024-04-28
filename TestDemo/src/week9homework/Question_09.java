package week9homework;

import java.util.ArrayList;

public class Question_09 {

    /*
    9. Write program and add all group names in to array and iterates through for
each loop.
     */

    public static void main(String[] args) {
        groupNames();

    }

    public static void groupNames(){
        ArrayList<String> groupNames = new ArrayList<>();
        groupNames.add("Code1");
        groupNames.add("Code2");
        groupNames.add("Code3");
        groupNames.add("Code4");
        System.out.println(groupNames);

        for (String names: groupNames){
            System.out.println(names);
        }

    }
}
