class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> hs = new ArrayList<>();

        for (int num : nums1) {
            hs.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int rs : nums2) {
            if (hs.contains(rs)) {
                result.add(rs);
                hs.remove(Integer.valueOf(rs)); 
            }
        }

        int[] ans = new int[result.size()];
        int i = 0;

        for (Integer num : result) {
            ans[i] = num;
            i++;
        }

        return ans;
    }
}