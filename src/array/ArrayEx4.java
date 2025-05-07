package array;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("정수 입력: ");
            nums[i] = sc.nextInt();

        }

        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max) max = nums[i];
            if(nums[i]<min) min = nums[i];
        }

        System.out.println("최대값 : "+max);
        System.out.println("최소값 : "+min);

    }
}
