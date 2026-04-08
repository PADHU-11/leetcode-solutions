class Solution {
    public List<List<Integer>> generate(int l) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<l;i++){
            List<Integer> sl=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    sl.add(1);
                }
                else{
                    sl.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }

            }
            list.add(sl);
        }
        return list;
        
    }
}