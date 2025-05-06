package operator;

public class Assign1 {
    public static void main(String[] args) {
        int a = 5;    // 초기값: 5
        a += 3;       // 8 (5 + 3)
        a -= 2;       // 6 (8 - 2)
        a *= 4;       // 24 (6 * 4)
//        a %= 5;       // 3 (8 % 5)
        double b = a /= 3;       // 8 (24 / 3)
        System.out.println(a); // 결과 출력: 3
        System.out.println(b); // 결과 출력: 3
    }
}
