package array;

public class Array1 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];

        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;



        int[] arr2 ={40,50,60};


//        System.out.println(arr1[0]);



        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }


        for(int num:arr2){
            System.out.println(num);

        }


    }
}
