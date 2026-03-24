class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        int cnt=0;
        int n=nums.length-1;
        for(int i=0;i<=n;i++){
            if(nums[i]!=0){
                nums[c++]=nums[i];
            }
            else{
                cnt++;
            }
        }
        while(c<=n){
            nums[c++]=0;
        }


    }
}