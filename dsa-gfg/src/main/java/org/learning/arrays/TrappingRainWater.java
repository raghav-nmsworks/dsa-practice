package org.learning.arrays;

public class TrappingRainWater {

    static int getWater(int arr[], int n){
        int res = 0;
        int lMax[] = new int[n];
        int rMax[] = new int[n];
        lMax[0] = arr[0];
        for (int i=1; i<n;i++){
            lMax[i] = Math.max(arr[i], lMax[i-1]);
        }
        rMax[n-1] = arr[n-1];
        for (int i=n-2; i>=0; i--){
            rMax[i] = Math.max((arr[i]), rMax[i+1]);
        }

        for (int i=1;i<n-1;i++){
            res += Math.min(lMax[i], rMax[i]) - arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {5,0,6,2,3};
        System.out.println(getWater(arr, arr.length));

        int arr1[] = {2,0,2};
        System.out.println(getWater(arr1, arr1.length));

        int arr2[] = {3,0,1,2,5};
        System.out.println(getWater(arr2, arr2.length));
    }
}
