package org.learning.binarySearch;

public class CountExecutive1s {
    static int countOnes(int arr[], int n){
        int l=0, h=n-1;
        while (l<=h){
            int mid = l + (h-l)/2;
            if (arr[mid] == 1){
                if (mid == 0 || arr[mid-1] != arr[mid]) return n-mid;
                else h = mid-1;
            }else if (arr[mid] < 1){
                l = mid+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1,1,1};
        System.out.println(countOnes(arr, arr.length));
    }
}
