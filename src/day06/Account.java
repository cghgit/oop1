package day06;

import java.util.Scanner;

public class Account {
    int cid;
    double balance;
    String customer;
    public void getInfo(){
        System.out.println("卡号："+cid);
        System.out.println("余额"+balance);
        System.out.println("所属用户"+customer);
    }
    //取钱
    public void withdraw(){
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入取钱数目：");
        int money= sc.nextInt();
        if (money>0 && money<=balance){
            balance=balance-money;
            System.out.println("取钱成功");
        }else if (money>balance){
            System.out.println("余额不足");
        }
    }
    public  void save(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存钱数目");
        int money=sc.nextInt();
        if (money>0){
            System.out.println("存钱成功！");
        }else{
            System.out.println("存款失败");
        }
    }
}
