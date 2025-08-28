package org.learning.arrays;

public class MaximumSubarraySum {
    static int maximumSubarraySum(int arr[], int n){
        int curr_max = 0;
        int max_sum = 0;
        for (int i=0;i<n;i++){
            curr_max = Math.max(curr_max + arr[i], arr[i]);
            max_sum = Math.max(curr_max, max_sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int arr[] = {-5,1,-2,3,-1,2,-2};
        System.out.println(maximumSubarraySum(arr, arr.length));
    }

}
