package org.learning.arrays;

public class CheckForSortedArray {

    static boolean ifSorted(int[] arr) {
        for (int i=0;i<arr.length -1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println(ifSorted(arr));

        int arr1[] = {1,3,2,4,5,6};
        System.out.println(ifSorted(arr1));
    }
}
