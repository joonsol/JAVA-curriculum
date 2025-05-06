package variable;

public class VarCasting3 {
    public static void main(String[] args) {
        char c = 'A';
        int ascii = c; // char → int (자동 변환)
        System.out.println(ascii); // 65

        int num = 66;
        char ch = (char) num; // int → char (강제 변환)
        System.out.println(ch); // 'B'
    }
}
