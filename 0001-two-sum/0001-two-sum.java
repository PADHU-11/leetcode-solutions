class Solution {
    public int[] twoSum(int[] arr, int target) {
        int l=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<l;i++){

            int needed=target-arr[i];
            if(map.containsKey(needed)){
                return new int[]{i,map.get(needed)};
            }
            map.put(arr[i],i);
        }
        return new int[]{0,0};

        
    }
}