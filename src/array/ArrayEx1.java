package array;

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int[] arr=new int[5];

      for(int i =0; i<arr.length;i++){
          System.out.println(i+1+"번 숫자를 입력하세요");
          arr[i]=sc.nextInt();

      }
      for(int i =0; i<arr.length;i++){
          if(arr[i]%2==0){
              System.out.println("짝수만 출력 : "+arr[i]);
          }
          }
    }
}
