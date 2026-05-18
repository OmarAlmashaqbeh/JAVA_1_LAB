package LabSheet_Solution.PAGE_11_12.Question_3;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        a1.setBalance(1000.0);
        a2.setBalance(2000.0);
        System.out.println("Account " + a1.getId() + " has balance: " + a1.getBalance());
        System.out.println("Account " + a2.getId() + " has balance: " + a2.getBalance());
        a1.withdraw(100.0);
        System.out.println("balance after withdrawal of 100.0 from account " + a1.getId() + ": " + a1.getBalance());
        a1.deposit(50.0);
        System.out.println("balance after deposit of 50.0 to account " + a1.getId() + ": " + a1.getBalance());
        System.out.println("Account " + a1.getId() + " has balance: " + a1.getBalance());
        System.out.println("Account " + a2.getId() + " has balance: " + a2.getBalance());
        System.out.println("Total number of accounts: " + Account.getNum());
    }
}