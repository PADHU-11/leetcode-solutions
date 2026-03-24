class Solution {
    public int fib(int n) {
        int start=0,end=1;
        if(n<2){
            return n;
        }
        for(int i=0;i<n;i++){
            int fibo=start+end;
            start=end;
            end=fibo;

        }
        
        return start;

        
    }
}