package day06;

public class Teacher {
    String name;
    int year;
    String course;
    String major;
    public void show(){
        System.out.println(name);
        System.out.println("教龄："+year);
        System.out.println("教授课程："+course);
        System.out.println("专业方向"+major);
    }
}
