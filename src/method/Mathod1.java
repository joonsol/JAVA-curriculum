package method;

public class Mathod1 {
    public static int addAndPrint(int a, int b) {

        System.out.println(a+"+"+b+": 연산수행:");

        return  a+b;
    }

    public static void main(String[] args) {

        int sum1= addAndPrint(1,3);
        System.out.println(sum1);
        int sum2 = addAndPrint(10,20);
        System.out.println(sum2);
    }
}
