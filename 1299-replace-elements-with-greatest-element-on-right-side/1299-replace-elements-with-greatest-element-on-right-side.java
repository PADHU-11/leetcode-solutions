class Solution {
    public int[] replaceElements(int[] arr) {
        int l=arr.length;
        int ind=0;
        int[] res=new int[l];
        for(int i=0;i<l;i++){
            int max=arr[l-1];
            for(int j=i+1;j<l-1;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            res[ind++]=max;
        }
        res[l-1]=-1;
        return res;
    }
}