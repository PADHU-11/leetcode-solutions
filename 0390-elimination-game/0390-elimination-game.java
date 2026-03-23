class Solution {
    public int lastRemaining(int n) {
        int remaining=n;
        int step=1;
        int start=1;
        boolean left=true;
        while(remaining>1){
            if(left || remaining%2==1){
                start+=step;
            }
            remaining/=2;
            step*=2;
            left=!left;
        }
        return start;
    }
}