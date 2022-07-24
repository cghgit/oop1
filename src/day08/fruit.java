package day08;

public class fruit {
    public String zha(String fruit,int num){
        String fru=fruit+"汁"+num+"杯";
        return fru;
    }
    public static void main(String[] args) {
        fruit fruit = new fruit();
      // 实参：桃子，2
        System.out.println(fruit.zha("桃子",2));
    }
}