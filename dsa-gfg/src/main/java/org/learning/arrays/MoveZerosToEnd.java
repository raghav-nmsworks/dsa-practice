package org.learning.arrays;

public class MoveZerosToEnd {
    static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[nonZeroIndex] = arr[i];
                if (i != nonZeroIndex){
                    arr[i] = 0;
                }
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 0, 2, 0, 9, 0 , 3};
        moveZerosToEnd(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
