package day06;

import java.util.Scanner;

public class Account {
    int cid;
    double balance;
    Customer customer;
    public double withdraw(double money){
        balance -=money;
        return balance;
    }
}
