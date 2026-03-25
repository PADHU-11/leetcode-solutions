class Solution {
    public int averageValue(int[] nums) {
        int l=nums.length;
        int sum=0,c=0;
        for(int i=0;i<l;i++){
            if(nums[i]%6==0){
                sum+=nums[i];
                c+=1;
            }
        }
        if(c==0){
            return 0;
        }
        int res= sum/c;
        return res;
    }
}