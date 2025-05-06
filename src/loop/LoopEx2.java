package loop;

public class LoopEx2 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        for(int j=0;j<=10;j++){
            if(j%2==0){
                System.out.println(j);
            }
        }
    }
}
