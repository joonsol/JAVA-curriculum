package method;

public class Mathod2 {

    public static void main(String[] args) {

        int sum = add(5,10);
        System.out.println("1 결과 출력: "+sum);

        int sum2 = add(8,9);
        System.out.println("1 결과 출력: "+sum2);
    }

    public static int add(int a,int b) {
        System.out.println(a+"+"+b+" 연산 수행");
        int sum =a+b;
        return  sum;
    }
}
