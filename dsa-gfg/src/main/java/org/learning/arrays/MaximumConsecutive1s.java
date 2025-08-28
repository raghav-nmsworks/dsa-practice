package org.learning.arrays;

public class MaximumConsecutive1s {
    static int maximumConsecutive1s(int arr[], int n){
        int count = 0;
        int maxCount = 0;

        for (int i=0;i<n; i++){
            if (arr[i] == 1){
                count++;
            }
            else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return Math.max(maxCount, count);
    }

    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1, 1, 1, 1};
        System.out.println(maximumConsecutive1s(arr, arr.length));

        int arr2[] = {1, 1, 1, 1};
        System.out.println(maximumConsecutive1s(arr2, arr2.length));
    }
}
