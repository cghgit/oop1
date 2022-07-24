package day08;

public class ArrayMax {
    public int max(int [] array){
        int temp=0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length-1 ; j++) {
                if (array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array[array.length-1];
    }

    public static void main(String[] args) {
        ArrayMax arrayMax = new ArrayMax();
        int list[]=new int[]{11,2,4,6,42};
        int max=arrayMax.max(list);
        System.out.println("最大值:"+max);
    }
}
