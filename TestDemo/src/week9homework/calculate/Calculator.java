package week9homework.calculate;

public class Calculator {

    /*
    1. Create one package with name calculate
2. Create two class with name “Calculator” and “Main”
3. Create four methods with manes “addition”, “subtraction”, “division”,
and “multiplication”. All methods are instance method and it doesn’t
return anything. But it has two parameters with name “int a” and “int
b”. Also each method have System.out.println(). This prints the result.
Also create all one more method with name “calculateResult” with
three parameter with name int a, int b and char symbol. Write the logic
in calculateResult method that when user enter first number and
second number and symbol based on symbol it does calculate.
     */

    public void addition(){
        int a = 25;
        int b = 25;
        System.out.println(a +b);
    }

    public void subtraction(){
        int c = 25;
        int d = 25;
        System.out.println(c - d);
    }

    public void multiplication(int e, int f){
        System.out.println(e * f);
    }

    public void division(int g, int h){
        System.out.println(g / h);
    }

    public void calculateResult(int a, int b, char symbol){
        System.out.println(a + b + symbol);
    }


    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.addition();
        c.subtraction();
        c.multiplication(5,5);
        c.division(10,2);
        // c.calculateResult(4,5, +);
    }
}
