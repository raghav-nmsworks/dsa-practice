package org.learning.string;

public class PrintFrequencies {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        printFrequencies(str);
    }

    private static void printFrequencies(String str) {
        int[] freq = new int[26];
        //checking by default values of array, it is 0
//        for (int i=0;i<freq.length;i++){
//            System.out.print(freq[i]);
//        }
        for (int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for (int i=0;i<26;i++){
            if (freq[i] > 0){
                System.out.println((char)(i+'a') + " " + freq[i]);
            }
        }
    }
}
