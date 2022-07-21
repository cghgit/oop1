package day06;

public class Customer {
    String name;
    String id;//身份证号
    String  phone;
    String address;
    public void say(){
        System.out.println("姓名"+name);
        System.out.println("身份证号"+id);
        System.out.println("电话"+phone);
        System.out.println("地址"+address);
    }
}
