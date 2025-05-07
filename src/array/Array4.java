package array;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        String[] names = {"홍길동","이순신","유관순"};
        String[] names = new String[3];

        for(int i=0;i<names.length;i++) {
            System.out.println((i+1)+"번 이름 입력");
            names[i]= sc.nextLine();
        }

        System.out.println("\n 입력한 이름 목록:");

        for(String name:names){
            System.out.println(name);
        }

    }
}
