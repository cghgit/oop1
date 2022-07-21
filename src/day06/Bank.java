package day06;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        account.cid=123456;
        account.balance=2000;
        account.customer="张三";
        Customer customer = new Customer();
        customer.name= account.customer;
        customer.phone="1317722222";
        customer.id="340421198912317887";
        customer.address="半圆学社";
        account.getInfo();
        account.withdraw();
        account.save();
        customer.say();
    }
}
