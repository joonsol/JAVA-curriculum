package loop;

public class For2 {
    public static void main(String[] args) {
        int endNum = 5;
        int sum = 0;
        for (int i = 0; i <= endNum; i++) {
            sum += i;
            System.out.println("누적합 : " + sum);
        }
        System.out.println("총합은?" + sum);
    }
}
