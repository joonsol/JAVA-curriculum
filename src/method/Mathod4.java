package method;

public class Mathod4 {


    public static String isOdd(int number){
        if(number%2==1){
            return  "홀수입니다";
        }else{
            return  "짝수입니다";
        }
    }
// public static boolean isOdd(int number){
//        if(number%2==1){
//            return  true;
//        }else{
//            return  false;
//        }
//    }

    public static void main(String[] args) {

//    boolean result=isOdd(2);
    String result=isOdd(2);
        System.out.println(result);

    }

}
