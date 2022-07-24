package day06;

import java.util.Scanner;

public class Admin {
    String username;
    String password;
    public void changePassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username1=scanner.next();
        System.out.println("请输入密码:");
        String password1= scanner.next();
        if (username1.equals(username) && password1.equals(password)){
            System.out.println("请输入新密码:");
            String password2= scanner.next();
            password=password2;
            System.out.println("修改密码成功，您的新密码是"+password);
        }else{
            System.out.println("用户名和密码不匹配！您没有权限更新管理员信息");
        }
    }
}