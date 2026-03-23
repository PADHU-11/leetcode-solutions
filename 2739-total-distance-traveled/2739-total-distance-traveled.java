class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int d=0;
        for(int i=1;i<=mainTank;i++){
            if(i%5==0 && additionalTank>0){
                mainTank+=1;
                additionalTank-=1;
            }
            d+=10;

        }
        return d;
    }
}