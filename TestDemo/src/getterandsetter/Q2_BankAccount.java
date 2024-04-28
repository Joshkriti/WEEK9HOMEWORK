package getterandsetter;

public class Q2_BankAccount {
    /*
    2. Write a Java program to create a class called BankAccount with private instance
variables accountNumber and balance. Provide public getter and setter methods to
access and modify these variables.
     */

   private int accountNumber;
   private int balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public static void main(String [] args){
        Q2_BankAccount b = new Q2_BankAccount();
        b.setAccountNumber(25658545);
        b.setBalance(500);
        System.out.println(b.getAccountNumber());
        System.out.println(b.getBalance());
        b.setAccountNumber(85452565);
        b.setBalance(900);
        System.out.println(b.getAccountNumber());
        System.out.println(b.getBalance());
    }
}
