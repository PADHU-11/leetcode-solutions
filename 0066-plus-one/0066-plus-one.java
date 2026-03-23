class Solution {
    public int[] plusOne(int[] nums) {
        int l=nums.length;
        for(int i=l-1;i>=0;i--){
            if(nums[i]<9){
                nums[i]++;
                return nums;
            }
            nums[i]=0;
        }
        int res[]=new int[l+1];
        res[0]=1;
        return res;
        
    }
}