class Solution {
    public int mySqrt(int x) {
        long res=x;
        long s=0;
        long e=x;
        while(s<=e){
            long mid=(s+e)/2;
            if((mid*mid)<=x){
                res=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return (int)res;
    }
}