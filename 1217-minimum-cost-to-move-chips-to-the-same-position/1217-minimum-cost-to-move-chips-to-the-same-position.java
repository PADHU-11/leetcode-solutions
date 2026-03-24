class Solution {
    public int minCostToMoveChips(int[] position) {
        int l=position.length;
        int oddPos=0;
        int evePos=0;
        for(int i=0;i<l;i++){
            if(position[i]%2==0){
                evePos+=1;
            }
            else{
                oddPos+=1;
            }
        }
        return Math.min(evePos,oddPos);
        
    }
}