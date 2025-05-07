package conditional;

import java.util.Scanner;

public class Conditional4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("과일을 입력하세요");

        String fruit = sc.next();//string만

        switch (fruit) {
            case "사과":
                System.out.println("사과는 빨간색");
                break;
            case "바나나":
                System.out.println("바나나는 노란색");
                break;
            default:
                System.out.println("알 수 없는 과일");
        }
    }
}
