package loop;

public class LoopEx4 {
    public static void main(String[] args) {

        int num=9;
        int result=0;
        for (int i=2;i<=num;i++) {
            for (int j = 1; j <= num; j++) {
                result = i * j;
                System.out.println(i + "X" + j + "="+result);
            }
            System.out.println("-------");
        }
    }


}
