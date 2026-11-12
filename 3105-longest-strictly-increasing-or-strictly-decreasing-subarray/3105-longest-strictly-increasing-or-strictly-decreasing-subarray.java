class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        int incCount = 1;
        int decCount = 1;
        int ans = 1;

        for(int i = 1; i<nums.length; i++){
            incCount = nums[i - 1] < nums[i] ? incCount + 1 : 1;
            decCount = nums[i - 1] > nums[i] ? decCount + 1 : 1;
            ans = Math.max(ans, Math.max(incCount, decCount));
        }

        return ans;
    }
}