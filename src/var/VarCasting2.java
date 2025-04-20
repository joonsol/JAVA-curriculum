package var;

public class VarCasting2 {
    public static void main(String[] args) {
        char c ='A';
        int ascii = c;//(자동변환)
        System.out.println(ascii);


        int num =66;
        char ch = (char) num;
        System.out.println(ch);
    }
}
