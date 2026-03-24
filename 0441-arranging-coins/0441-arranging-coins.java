class Solution {
    public int arrangeCoins(int n) {
        int ind=1;
       for(int i=1;i<=n;i++){
            if(n>0){
            n-=i;
            ind=i;
            }
       }
       return ind;
    }
}