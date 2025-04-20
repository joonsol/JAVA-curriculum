package var;

public class Var3 {
    public static void main(String[] args) {
        byte b = 127; // byte 범위 내 값
        short s = 32767; // short 최대값
        int i = 2147483647; // int 최대값
        long l = 9223372036854775807L; // long 최대값 (L 필수)

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
    }
}
