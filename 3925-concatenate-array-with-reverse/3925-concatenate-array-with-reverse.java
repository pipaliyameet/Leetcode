class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n*2];
        int index = 0;

        for(int i = 0; i < n*2; i++){
            arr[i] = nums[i < n ? index++ : --index];
        }

        return arr;
    }
}