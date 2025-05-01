package conditional;

public class Conditional1_Ex5 {
    public static void main(String[] args) {

        int price = 19800;

        int age = 9;

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
