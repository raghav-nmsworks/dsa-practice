package org.learning.arrays;

public class MaximumDifference {

    //maximum value of arr[j] - arr[i] where j > i
    static int maxDifference(int arr[]){
        int minElement = arr[0];
        int maxDiff = arr[1] - arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i] < minElement){
                minElement = arr[i];
            }
            maxDiff = Math.max(maxDiff, arr[i]-minElement);
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,10,6,4,8,1};
        int arr1[] = {7,9,5,6,3,2};
        System.out.println(maxDifference(arr));
        System.out.println(maxDifference(arr1));
    }
}
