package conditional;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");

        int number = sc.nextInt();

        System.out.println("입력한 숫자 :"+ number);
    }
}
