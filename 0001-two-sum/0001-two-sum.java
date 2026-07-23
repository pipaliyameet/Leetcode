class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a;
        for(int i=0 ; i<nums.length ; i++){
            for(int j=0 ; j<nums.length ; j++){
                if(i!=j){
                    int n = nums[i]+nums[j];
                    if(n==target){
                        return new int[]{i,j};
                    }
                }
            }
        }
        return new int[0];
    }
}