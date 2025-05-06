package variable;

public class VarCasting4 {
    public static void main(String[] args) {
        int i = 10;
        double d = i; // 자동 변환 (int → double)
        System.out.println(d);


        double pi = 3.14159;
        int intPi = (int) pi; // 강제 변환 (double → int, 소수점 제거)
        System.out.println(intPi); // 3

    }
}
