class Solution {
    public int dominantIndices(int[] nums) {
        
        int sum = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++) sum += nums[i];

        int count = 0;

        for(int i = 0; i < n - 1; i++){
            sum -= nums[i];
            if(nums[i] > (sum / (n-i-1))) count++;
        }

        return count;
    }
}