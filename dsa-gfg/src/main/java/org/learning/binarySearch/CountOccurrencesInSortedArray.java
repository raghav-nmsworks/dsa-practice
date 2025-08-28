package org.learning.binarySearch;

public class CountOccurrencesInSortedArray {
    static int countOccurrences(int arr[], int n, int x){
        System.out.println("inside countOccurrences");
        //find first occurrence
        int first = IndexOfFirstOccurrence.binarySearchApproach(arr, n, x);
        System.out.println("first occurance : " + first);
        int last = -1;
        // check if first occurrence is -1  return 0
        if (first == -1) return 0;
        //if first occurrence is equal to n-1 return 1
        else if (first == n-1) return 1;
        // find last occurrence
        else {
            last = IndexOfLastOccurance.binarySearchApproach(arr, n-1, x);
            System.out.println("last occurance : " + last);
        }
        return last - first + 1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 3, 4};
        int n = arr.length;
        int x = 2;
        System.out.println(countOccurrences(arr, n, x));
    }
}
