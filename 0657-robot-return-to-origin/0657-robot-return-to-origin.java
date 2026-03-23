class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        int l=moves.length();
        for(int i=0;i<l;i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                x-=1;
            }
            else if(ch=='D'){
                x+=1;
            }
            else if(ch=='R'){
                y+=1;
            }
            else if(ch=='L'){
                y-=1;
            }
        }
        if(x==0 && y==0){
            return true;
        }
        return false;
    }
}