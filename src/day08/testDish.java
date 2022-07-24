package day08;

import java.util.Scanner;

public class testDish {
    public static void main(String[] args) {
        newdish newdish = new newdish();
        newdish.dish[0]="汉堡王";
        newdish.dish[1]="啃得起";
        newdish.dish[2]="华莱士";
        newdish.price[0]=48.0;
        newdish.price[1]=38.0;
        newdish.price[2]=28.0;
        newdish.zan[0]=0;
        newdish.zan[1]=0;
        newdish.zan[2]=0;
        newdish.names[0]="张三";
        newdish.dishNames[0]="鱼香肉丝";
        newdish.times[0]=12;
        newdish.addresses[0]="半圆学社";
        newdish.states[0]=0;
        newdish.sumprice[0]=13;
        newdish.names[1]="李四";
        newdish.dishNames[1]="杭椒炒肉";
        newdish.times[1]=11;
        newdish.addresses[1]="钟山金典";
        newdish.states[1]=0;
        newdish.sumprice[1]=15;
        System.out.println("***欢迎使用吃货联盟订餐系统***");
        Scanner sc=new Scanner(System.in);
        boolean isExit = false;//表示是否退出，false不退出，true退出
        do {
            newdish.isAdd=false;
            newdish.idFind=false;
            newdish.isDel=false;
            System.out.println("**********************************************");
            System.out.println("1.我要订餐");
            System.out.println("2.查看餐袋");
            System.out.println("3.签收订单");
            System.out.println("4.删除订单");
            System.out.println("5.我要点赞");
            System.out.println("6.退出系统");
            System.out.println("**********************************************");
            System.out.print("请选择：");
            int choice =sc.nextInt();
            switch (choice){
                case 1:newdish.addOrder();
                    break;
                case 2: newdish.checkOrder();
                    break;
                case 3:newdish.signOrder();
                    break;
                case 4: newdish.delOrder();
                break;
                case 5 :newdish.zan();
                break;
                case 6 :System.out.println("***退出系统***");
                    isExit =true;
                    break;
            }
        }while(!isExit);
        System.out.println("欢迎下次光临");
    }
}
