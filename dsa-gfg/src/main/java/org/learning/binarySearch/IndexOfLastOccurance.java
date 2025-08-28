package org.learning.binarySearch;

public class IndexOfLastOccurance {
    static int binarySearchApproach(int arr[], int n, int x){
        int l=0, h=n-1;
        while (l<=h){
            int mid = l + (h-l)/2;
            if (arr[mid] == x){
                if (mid == n-1 || arr[mid+1] != arr[mid]) return mid;
                else l = mid+1;
            }
            else if (arr[mid] > x){
                h = mid-1;
            }
            else {
                l = mid+1;
            }
        }
        return -1;
    }

    static int binarySearchApproach2(int arr[], int n, int x){
        int l=0, h=n-1, ans=-1;
        while (l<=h){
            int mid = l + (h-l)/2;
            if (arr[mid] == x){
                ans = mid;
                l = mid+1;
            }
            else if (arr[mid] > x){
                h = mid-1;
            }
            else {
                l = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10,15,20,20,40,40};
        System.out.println(binarySearchApproach(arr, arr.length, 20));

        System.out.println(binarySearchApproach2(arr, arr.length, 20));
    }
}
