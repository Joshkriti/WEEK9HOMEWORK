package week9homework;

import java.util.ArrayList;

public class Question_10 {

    /*
    10. Write program and add all group members names in to array and iterates
through for each loop and print your name.
     */

    public static void main(String[] args) {
        groupMembersName();


    }

    public static void groupMembersName(){
        ArrayList<String> groupMembersName = new ArrayList<>();
        groupMembersName.add("Kinjal");
        groupMembersName.add("Deval");
        groupMembersName.add("Vaishali");
        groupMembersName.add("Rushi");
        groupMembersName.add("Myself Komal");
        System.out.println(groupMembersName);

        System.out.println("-----------------------");

        for(int i = 4; i<groupMembersName.size(); i++){
            System.out.println(groupMembersName.get(i));

        }

    }
}
