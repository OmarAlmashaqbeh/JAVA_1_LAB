package LabSheet_Solution.PAGE_11_12.Question_3;

public class Account {
    private static int num = 0;
    private int id;
    private double balance;
    public Account() {
        balance = 0.0;
        id = ++num;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static int getNum() {
        return num;
    }
    public static void setNum(int num) {
        Account.num = num;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("You don't have enough balance to withdraw " + amount);
        }
    }
    public void deposit(double amount) {
        balance += amount;
    }
}