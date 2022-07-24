package day08;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class demo01 {
    double score1;
    double sum;
    double avgerage;
    public void score(){
        Scanner scanner = new Scanner(System.in);
        score1= scanner.nextInt();
        sum+=score1;
    }
    public double sum(){
        return sum;
    }
    public double avg(){
        avgerage=sum/3;
        return avgerage;
    }
}


