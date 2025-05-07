package array;


public class Array5 {
    public static void main(String[] args) {

//        다차원 배열

    int[][] matrix = new int[2][3];

    for(int i=0;i<matrix.length;i++){
        for(int j =0;j<matrix[i].length;j++){
            matrix[i][j]=(i+1)*(j+1);

            System.out.println(matrix[i][j]+"-");
        }
        System.out.println();

    }


    }
}
