package org.learning.binarySearch;

public class BinarySearchRecursive {

    static int binarySearchRecursive(int arr[], int l, int h, int x){
        if (l>h) return -1;
        int mid = l + (h-l)/2;
        if (arr[mid] == x) return mid;
        else if(arr[mid] > x) return binarySearchRecursive(arr, l, mid-1, x);
        else return binarySearchRecursive(arr, mid+1, h, x);
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        System.out.println(binarySearchRecursive(arr, 0, arr.length-1, 20));
        int arr2[] = {10,20,30};
        System.out.println(binarySearchRecursive(arr2, 0, arr2.length-1, 10));
    }
}
