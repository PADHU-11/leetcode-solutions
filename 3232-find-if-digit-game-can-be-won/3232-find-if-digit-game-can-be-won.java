class Solution {
    public boolean canAliceWin(int[] nums) {
        int l=nums.length;
        int a=0;
        int b=0;
        for(int i=0;i<l;i++){
            if(nums[i]<10){
                a+=nums[i];
            }
            else{
                b+=nums[i];
            }
        }
        if(a>b || b>a){
            return true;
        }
        return false;
    }
}