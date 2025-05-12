package method;

import java.lang.reflect.Array;

public class MathodEx3 {

    public static void main(String[] args) {

       int[] numbers ={10,20,30,40};
       int result = sum(numbers);

        System.out.println("합계: "+result);

    }

    public static int sum(int[] arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        return sum;
    }

}
