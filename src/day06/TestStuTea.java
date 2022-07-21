package day06;

public class TestStuTea {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        student.name="张三";
        student.age=18;
        student.banji=3;
        student.hobby="篮球";
        teacher.name="李四";
        teacher.year=5;
        teacher.course="java";
        teacher.major="计算机";
        student.show();
        teacher.show();
    }
}
