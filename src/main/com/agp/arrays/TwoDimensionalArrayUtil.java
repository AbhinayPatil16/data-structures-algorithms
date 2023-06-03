package src.main.com.agp.arrays;

import java.util.Arrays;

public class TwoDimensionalArrayUtil {

    /*
    * This methods creates the dynamic 2D array.
    * For Example :
    * input - createInt2DArray(2,3)
    * output - {{123},{456}}
    * */
    public static int[][] createInt2DArray(int rows, int columns) {
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = (i + 1) * (j + 1);
            }
        }
        return result;
    }

    public static int[] searchIntValueInArray(int value, int[][] array) {
        if (array == null || array.length == 0) {
            return new int[]{-1};
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == value) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1};
    }

    /*
    * This method calculates the sum of diagonal elements of 2D array.
    * */
    public static int sumDiagonalElements(int[][] array){
        if(array.length==0){
            return 0;
        }
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(createInt2DArray(3, 3)));
        System.out.println(sumDiagonalElements(createInt2DArray(3, 3)));

    }

}
