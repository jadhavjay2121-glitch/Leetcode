class Solution {
    public int findDuplicate(int[] nums) {
      HashSet <Integer> sh=new HashSet<Integer>();
      for(int n:nums){
        if(sh.contains(n)){
            return n;
        }
        sh.add(n);
      }
      return -1;
    }
}