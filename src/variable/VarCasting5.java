package variable;

public class VarCasting5 {
    public static void main(String[] args) {
        String str = "100";
        int num = Integer.parseInt(str); // 문자열 → 정수 변환
        System.out.println(num + 10); // 110

        int n = 200;
        String s = String.valueOf(n); // 숫자 → 문자열 변환
        System.out.println(s + "원"); // "200원"

    }
}
