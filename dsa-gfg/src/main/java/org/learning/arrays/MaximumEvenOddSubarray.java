package org.learning.arrays;

public class MaximumEvenOddSubarray {
    static int maximumEvenOddSubarray(int arr[], int n){
        int res = 1;
        int curr = 1;
        for (int i=1;i<n;i++){
            if ((arr[i-1] % 2==0 && arr[i]%2==1) || arr[i-1]%2==1 && arr[i]%2==0){
                curr++;
                res = Math.max(res, curr);
            }
            else{
                curr = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={10,12,14,7,8};
        System.out.println(maximumEvenOddSubarray(arr,arr.length));

        int arr1[] = {7,10,13,14};
        System.out.println(maximumEvenOddSubarray(arr1,arr1.length));

        int arr2[] = {10,12,8,4};
        System.out.println(maximumEvenOddSubarray(arr2,arr2.length));

    }
}
