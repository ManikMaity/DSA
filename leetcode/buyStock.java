package leetcode;


class buyStock {

    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = left + 1;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] >= prices[right]){
                left = right;
            }
            else{
                int profit = prices[right] - prices[left];
                if (maxProfit < profit){
                    maxProfit = profit;
                }
            }
            right++;
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int max = maxProfit(prices);
        System.out.println(max);
    }
}