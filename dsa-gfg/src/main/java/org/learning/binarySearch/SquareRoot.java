package org.learning.binarySearch;

public class SquareRoot {
    static int findSquareRoot(int n){
        int l=0, h=n;
        while (l<=h){
            int mid = l + (h-l)/2;
            if (mid*mid == n) return mid;
            else if (mid * mid > n) h = mid-1;
            else l = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findSquareRoot(16));
        System.out.println(findSquareRoot(625));
    }
}
