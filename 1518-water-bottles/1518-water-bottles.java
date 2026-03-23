class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int c=numBottles;
        while(numBottles>=numExchange){
            int newB=numBottles/numExchange;
            int remB=numBottles%numExchange;
            c+=newB;
            numBottles=remB+newB;
        }
        return c;
    }
}