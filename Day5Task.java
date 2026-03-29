1-two sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        int stat=0;
        while(stat!=nums.length-1){
        for(int itr=0;itr<nums.length;itr++){
            if(stat!=itr && nums[stat]+nums[itr]==target){
                res[0]=stat;
                res[1]=itr;
                
            }   
        }
        stat++;
        }
        return res;
    }
169- Majority element

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        int tor=nums[0];
        int max=1;
        for(int i=1;i<nums.length;i++){
           if(nums[i]==nums[i-1]){
             c++;
           }else {
            if(c>max){
                max=c;
                tor=nums[i-1];
            }
            c=1;
           }
        }
        if(c>max){
            tor=nums[nums.length-1];
        }
        return tor;
    }
}

724-pivot index

public class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for (int x : nums) {
            totalSum += x;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}