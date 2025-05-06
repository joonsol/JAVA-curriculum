package loop;

public class For4 {
    public static void main(String[] args) {

        for (int i = 0; i <3; i++) {
            System.out.println("외부 for 시작 i:" + i);

            for (int j = 0; j < 2; j++) {
                System.out.println("외부 for 시작 j:" + j);

            }
            System.out.println("외부 for 종료: " + i);
            System.out.println();
        }
    }
}
