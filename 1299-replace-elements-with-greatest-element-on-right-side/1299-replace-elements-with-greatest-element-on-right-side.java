class Solution {
    public int[] replaceElements(int[] arr) {
        int n=0;
        int j=1;
        while(n<arr.length-1){
            int max=0;
        for(int i=j;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
          arr[n]=max;
             n++;
             j++;
        }
        arr[arr.length-1]=-1;
        return arr;

        }
        
        
    }
