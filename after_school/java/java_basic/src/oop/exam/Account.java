package oop.exam;

public class Account {
    int balance;


    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        if(balance < amount) {
            System.out.println("작업 부족");
        } else {
            balance -= amount;
        }
    }
}