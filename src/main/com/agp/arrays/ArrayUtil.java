package src.main.com.agp.arrays;

import java.util.Arrays;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] input = new int[3];
        input[0] = 1;
        input[1] = 2;
        input[2] = 3;
        System.out.println(findMissingNumberInArray(new int[]{1,2,3,4,6}));
    }

    /*
     This method takes an array and returns a new array that contains all but the first and last elements
    */
    public static int[] middle(int[] array) {

        if (array == null || array.length == 0) {
            return new int[0];
        }
        if (array.length == 1 || array.length == 2) {
            return array;
        }
        int[] returnArray = new int[array.length - 2];
        int i = 1;
        while (i <= array.length - 2) {
            returnArray[i - 1] = array[i];
            i++;
        }
        return returnArray;
    }

    /*
    * This method finds the top two scores in a given array.
    * */
    public static int[] findTopTwoScores(int[] array){

        if(array==null || array.length == 0){
            return new int[]{-1};
        }
        if(array.length == 1 || array.length == 2){
            return array;
        }
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int score: array){
            if(score > firstHighest){
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }
        return new int[]{firstHighest,secondHighest};
    }

    /*
    * This method takes an integer array containing n-1 unique elements from a range of 1 to n,
    * with one missing number, and returns the missing number.
    * */
    public static int findMissingNumberInArray(int[] array){
        if(array == null || array.length==0){
            return -1;
        }
        if(array.length == 1){
            return array[0];
        }
        int totalSum = (array.length+1) * (array.length+2)/2;
        int elementSum = 0;
        for(int element : array){
            elementSum += element;
        }

        return totalSum-elementSum;
    }

}
