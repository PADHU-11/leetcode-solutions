class Solution {
    public int arrangeCoins(int n) {
        //trying binary search
        long start=1;
        long end=n;
        int res=0;
        while(start<=end){
            long mid=start+(end-start)/2;
            long coins_needed=mid*(mid+1)/2;
            if(n>=coins_needed){
                res=(int)mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return res;
    }
}