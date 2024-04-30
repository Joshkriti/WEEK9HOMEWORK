package week9homework.calculate;

import java.util.Scanner;

public class Main {
    /*
    4. Write a “main” method into main class. It has scanner that takes user
input. Also write the logic that it ask user to “Enter first Number:”,
“Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
enter + symbol result like “Addition of 5 and 10 is: 15” and respective
for other symbol.
5. With the result it’s also print one more message “Would you like to do
more calculation Please enter “Y” or “N” :” (Hint use while loop if user
enter Y program asking the user to enter First Number, and if user enter
N program should terminate)
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("Please enter one of symbol +, -, *, / : ");
        String symbol = sc.next();

        int result = perform(firstNumber, secondNumber, symbol);

        System.out.println("Your answer is: " + result);

    }

    private static int perform(int firstNumber, int secondNumber, String symbol){
        int result = 0;
        if (symbol.equals("+")) {
            result = firstNumber + secondNumber;
        }
        else if (symbol.equals("-")){
            result = firstNumber - secondNumber;
        }
        else if (symbol.equals("*")) {
            result = firstNumber * secondNumber;
        }
        else if (symbol.equals("/")) {
            result = firstNumber / secondNumber;
        }
        else {
            System.out.println("INVALID NUMBER");
        }
        return result;
    }

}
