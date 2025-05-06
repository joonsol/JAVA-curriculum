package loop;

public class LoopEx3 {
    public static void main(String[] args) {
        int i = 0;
        int max = 11;
        int sum = 0;
//        while (i<=max){
//            i++;
//            sum+=i;
//            System.out.println("sum: "+sum+", i: "+i);
//        }
        for (int j = 0; j <= max; j++) {
            sum += j;

            System.out.println("sum: " + sum + ", j: " + j);
        }


    }


}
