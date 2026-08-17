class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs= new HashSet<>();
        for(int num :nums1){
            hs.add(num);
        } 
        HashSet<Integer> result=new HashSet<>();
        for(int rs:nums2){
            if(hs.contains(rs)){
                result.add(rs);
            }
        }
        int ans[]=new int[result.size()];
        int i=0;
        for(Integer num:result){
            ans[i]=num;
            i++;
        }
       return ans; 
    }
}