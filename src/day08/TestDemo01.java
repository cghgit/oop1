package day08;

public class TestDemo01 {
    public static void main(String[] args) {
        demo01 demo01 = new demo01();
        System.out.println("请输入JAVA成绩");
        demo01.score();
        System.out.println("请输入C#成绩");
        demo01.score();
        System.out.println("请输入DB成绩");
        demo01.score();
        System.out.println("总成绩是:"+ demo01.sum());
        System.out.println("平均分是:"+ demo01.avg());
    }
}
