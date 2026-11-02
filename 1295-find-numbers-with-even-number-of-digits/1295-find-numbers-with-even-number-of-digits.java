class Solution {

    private boolean digitIsEven(int n){
        int count = 0;
        
        while(n > 0){
            count++;
            n /= 10;
        }

        return count % 2 == 0 ? true : false;
    }

    public int findNumbers(int[] nums) {

        int digitCount = 0;

        for(int i = 0; i<nums.length; i++) if(digitIsEven(nums[i])) digitCount++;

        return digitCount;
    }
}