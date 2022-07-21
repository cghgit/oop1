package day06;

public class TestSpouse {
    public static void main(String[] args) {
        Husband husband = new Husband();
        Wife wife = new Wife();
        husband.name="张三";
        husband.age=41;
        wife.name="李梅";
        wife.age=40;
        husband.wife= wife.name;
        husband.wifeage= wife.age;
        wife.husband= husband.name;
        wife.husbandage= husband.age;
        husband.getInfo();
        wife.getInfo();
    }
}
