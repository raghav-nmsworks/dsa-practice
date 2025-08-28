package org.learning.binarySearch;

public class IndexOfFirstOccurrence {
    static int naiveApproach(int arr[], int n, int x){
        for (int i=0;i<n;i++){
            if (arr[i] == x) return i;
        }
        return -1;
    }

    static int binarySearchRecursiveApproach(int arr[], int l, int h, int x){
        if (l>h) return -1;
        int mid = l + (h-l)/2;
        if (arr[mid] == x){
            if (mid == 0 || arr[mid-1]!= arr[mid]) return mid;
            else return binarySearchRecursiveApproach(arr, l, mid-1, x);
        }
        else if (arr[mid] > x) return binarySearchRecursiveApproach(arr, l, mid-1, x);
        else return binarySearchRecursiveApproach(arr, mid+1, h, x);
    }

    static int binarySearchApproach(int arr[], int n, int x){
        int l=0, h=n-1;
        //System.out.println("l : " + l + " h : " + h);
        while (l<=h){
            int mid = l + (h-l)/2;
            if (arr[mid] == x){
                if (mid == 0 || arr[mid]!= arr[mid-1]) return mid;
                else h = mid-1;
            }
            else if (arr[mid] > x){
                h = mid-1;
            }else {
                l = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5,10,10,15,20,20,20};
        System.out.println(binarySearchRecursiveApproach(arr, 0, arr.length-1, 20));
        System.out.println("=======================");
        System.out.println(binarySearchApproach(arr, arr.length, 20));
    }


}
