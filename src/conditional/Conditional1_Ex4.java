package conditional;

import java.util.Scanner;

public class Conditional1_Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째숫자를 입력하세요");
        int num1 = sc.nextInt();
        System.out.println("두번째숫자를 입력하세요");

        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println(num1+"가(이) 큰 숫자 입니다.");
        } else if (num1<num2) {
            System.out.println(num2+"가(이) 큰 숫자 입니다.");

        }else{
            System.out.println(num1+"과(와)"+num2+"가(이) 같습니다.");

        }


    }
}
