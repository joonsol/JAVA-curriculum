package conditional;

public class Conditional1_Ex4 {
    public static void main(String[] args) {

        int num1 = 24;
        int num2 = 24;

        if(num1>num2){
            System.out.println(num1+"가(이) 큰 숫자 입니다.");
        } else if (num1<num2) {
            System.out.println(num2+"가(이) 큰 숫자 입니다.");

        }else{
            System.out.println(num1+"과(와)"+num2+"가(이) 같습니다.");

        }


    }
}
