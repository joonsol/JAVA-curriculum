package array;

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "번째 숫자 입력");
            arr[i] = sc.nextInt();


        }
        System.out.println("짝수 출력학기");
        for(int num:arr){

            if (num % 2 == 0) {
                System.out.println("짝수:" +num);

            }
        }
    }
}
