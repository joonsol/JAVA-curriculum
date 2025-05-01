package conditional;

public class Conditional5 {
    public static void main(String[] args) {
        int num = 10;
        String result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println("num은 "+result+" 입니다.");
    }
}
