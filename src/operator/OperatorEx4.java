package operator;

public class OperatorEx4 {
    public static void main(String[] args) {

        int x =25;
        int y =4;

        double remainder = x%y;

        boolean isDivisible = remainder==0;

        System.out.println("나눈 나머지: "+remainder);
        System.out.println("나누어 떨어지는지: "+isDivisible);

    }
}
