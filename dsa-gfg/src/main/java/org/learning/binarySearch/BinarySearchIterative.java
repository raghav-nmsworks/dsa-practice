package org.learning.binarySearch;

public class BinarySearchIterative {
    static int binarySearchIterative(int arr[], int n, int x){
        int l=0, h=n-1;
        while (l<=h){
            int mid =  l + (h-l)/2;
            //System.out.println(mid);
            if (arr[mid] == x){
                return mid;
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

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        System.out.println(binarySearchIterative(arr, arr.length, 20));
    }
}
