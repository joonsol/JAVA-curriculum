package array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        int[] nums = new int[5];

        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i=0;i<5;i++){
            System.out.println(i+1+"번째 숫자 입력: ");
            nums[i]=sc.nextInt();

            sum+=nums[i];


        }
        System.out.println("합계 : "+sum);


    }
}
