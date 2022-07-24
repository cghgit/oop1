package day08;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentBiz studentBiz = new StudentBiz();
        studentBiz.showName();

        int start, end;
        String name;
        System.out.print("输入起始位置：");
        start = scanner.nextInt();
        System.out.print("输入结束位置：");
        end = scanner.nextInt();
        System.out.print("输入姓名：");
        name = scanner.next();
        if (studentBiz.searchName(start, end, name)) {
            System.out.println("Succeed!");
        } else {
            System.out.println("Failed!");
        }

    }
}
