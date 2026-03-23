class Solution {
    public int integerReplacement(int n) {
        if(n<=1){
            return 0;
        }
        long num=n;
        int c=0;
        while(num>1){
            if(num%2==0){
                num/=2;
            }
            else{
                if( num==3 || num%4==1){
                    num=num-1;
                }
                else{
                    num=num+1;
                }
            }
            c+=1;
        }
            return c;

        
        
    }
}