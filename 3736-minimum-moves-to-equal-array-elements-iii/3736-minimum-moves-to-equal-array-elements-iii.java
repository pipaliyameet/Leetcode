class Solution {
    public int minMoves(int[] nums) {
        
        Arrays.sort(nums);

        int n = nums.length;
        int last = nums[n - 1];
        int count = 0;

        for(int i = 0; i<n; i++) count += Math.abs(nums[i] - last);

        return count;
    }
}