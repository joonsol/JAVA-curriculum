package conditional;

import java.util.Scanner;

public class Conditional1_Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("가격을 입력하세요");
        int price = sc.nextInt();


        System.out.println("나이를 입력하세요");
        int age = sc.nextInt();


        int discount = 0;

        if (price >= 10000) {
            discount =+1000;
            System.out.println("만원이상 할인금 액 1000원");
        }
        if (age <= 10) {
            discount = +1000;
            System.out.println("어린이 할인 금액 1000원 ");
        }

        int finalPrice = price-discount;

        System.out.println("총 금액은 "+finalPrice+"원 입니다.");

    }
}
