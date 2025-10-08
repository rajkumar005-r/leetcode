class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totaldrink=0;
        int empty=0;
        while(numBottles>0)
        {
            totaldrink+=numBottles;
            empty+=numBottles;
            numBottles=empty/numExchange;
            empty=empty % numExchange;
        }
        return totaldrink;

    }
}