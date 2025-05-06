package conditional;

public class Conditional3 {
    public static void main(String[] args) {
        char grade ='B';

        switch (grade){
            case 'A':
                System.out.println("우수");
                break;
            case 'B':
                System.out.println("좋음");
                break;
            case 'C':
                System.out.println("보통");
                break;
            case 'D':
                System.out.println("우수");
                break;
            default:
                System.out.println("재시험");
                break;

        }
    }
}
