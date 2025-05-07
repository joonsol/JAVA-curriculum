package array;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {

        int[] scores={85,90,78,92,88};
        int sum =0;

        for(int score :scores) sum+=score;

        double avg = (double)  sum/scores.length;

        System.out.println("평균 점수 : "+avg);


    }
}
