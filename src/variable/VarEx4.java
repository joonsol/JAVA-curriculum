package variable;


public class VarEx4 {
    public static void main(String[] args) {
        String str = "100";
        int num = Integer.parseInt(str);

        System.out.println(num + 10); // 110 출력

        int n = 200;
        String s = String.valueOf(n); // 정수형 n을 문자열로 변환

        System.out.println(s + '원'); // 200원 출력
    }
}
