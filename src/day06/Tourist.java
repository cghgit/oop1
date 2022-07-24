package day06;

import java.util.Scanner;

public class Tourist {
    String name;
    int age;
    public void show(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("请输入姓名：");
            name = scanner.next();
            if ("n".equals(name)){
                System.out.println("退出程序");
                break;
            }
            System.out.println("请输入年龄：");
            age= scanner.nextInt();
            if (age>10){
                System.out.println(name+"的年龄为:"+age+",门票价格为:20元");
            }else if (age>0 && age<=10){
                System.out.println(name+"的年龄为:"+age+",门票免费");
            }

        }while (true);
    }
}
