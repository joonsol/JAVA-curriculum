package loop;

public class For3 {
    public static void main(String[] args) {
        int endNum = 15;
        int sum = 0;
        for (int i = 0; i <= endNum; i++) {
            sum += i;
            if(sum>10){
                System.out.println("10이 넘는 숫자:"+sum);
                break;
            }
        }
        System.out.println("총합은?" + sum);
    }
}
