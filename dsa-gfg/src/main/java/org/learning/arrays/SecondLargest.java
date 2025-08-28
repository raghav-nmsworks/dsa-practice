package org.learning.arrays;

public class SecondLargest {

    static int findSecondLargest(int[] arr) {
        int largest = arr[0] , secondLargest = -1;
        for (int i=0;i<arr.length;i++){
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(findSecondLargest(arr));
    }
}
