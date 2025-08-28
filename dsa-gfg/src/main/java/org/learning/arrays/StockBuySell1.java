package org.learning.arrays;


//buy sell multiple time to maximize profit
public class StockBuySell1 {
    static int maxProfit(int price[], int n){
        int profit = 0;
        for(int i=0;i<n-1; i++){
            if (price[i] < price[i+1]){
                profit += price[i+1] - price[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int price[] = {1,5,3,8, 12};
        System.out.println(maxProfit(price, price.length));
        int price1[] = {30, 20, 10};
        System.out.println(maxProfit(price1, price1.length));
        int price2[] = {10, 20, 30};
        System.out.println(maxProfit(price2, price2.length));
        int price3[] = {1, 5, 3, 1, 2, 8};
        System.out.println(maxProfit(price3, price3.length));
    }
}
