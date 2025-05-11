package array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("학생 점수 입력하세요");
        int sum = 0;
        double avg = 0;


        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + "번 평균");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        avg = sum / arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > avg) {
                count++;
            }

        }

        System.out.println("평균 점수: "+avg+"점");
        System.out.println("평균 이상인 학생 수: "+ count+"명");


    }
}
