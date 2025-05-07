package array;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        int count=0;
        for(int i=0;i<names.length;i++){
            System.out.println((i+1)+"번 이름을 입력하세요");
            names[i]=sc.next();

            if(names[i].startsWith("김")){
                count++;
            }
        }
            System.out.println("김씨 성을 가진 사람 수 : "+count+"명");

    }
}
