class Solution {
    public int findNumbers(int[] nums) {
    
       int c=0;
        for(int i= 0;i<nums.length;i++){
            int count=0;
            int dig=0;
           while(nums[i]!=0){
            dig=nums[i]%10;
            count++;
            nums[i]=nums[i]/10;
           }
      if(count%2==0){
        c++;
      }
            }
         return c;
        }
    
        
    }
