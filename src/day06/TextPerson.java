package day06;

public class TextPerson {
    public static void main(String[] args) {
        /*如果在同一个包内，就不需要导包
        创建对象
       对象名 引用= new 对象名()
         */
        Person student = new Person();
        student.age=18;
        student.name="张三";
        student.show();
    }
}
