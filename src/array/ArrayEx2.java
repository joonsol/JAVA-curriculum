package array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scores = new int[5];
        int total = 0;
        double avg = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번째 점수 입력");
            scores[i] = sc.nextInt();

            total += scores[i];

        }
        System.out.println("평균 구하기");

        avg = total / scores.length;
        int count = 0;

        for (int score : scores) {

            if (score >= avg) {
                count++;
            }
        }
            System.out.println("평균" + avg);
            System.out.println("평균 이상 학생수 : " + count+"명");
    }
}
