package org.learning.arrays;

public class FrequenciesInSortedArray {

    static void printFrequency(int arr[]){
        int freq = 1;
        int i=1;
        while (i<arr.length){
            while (i<arr.length && arr[i] == arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i] + " " + freq);
            i++;
            freq++;
        }
    }
    public static void main(String[] args) {

    }
}
