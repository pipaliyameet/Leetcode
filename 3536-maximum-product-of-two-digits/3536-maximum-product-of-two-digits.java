class Solution {
    public int maxProduct(int n) {
        
        int max = 0;
        int secondMax = 0;
        int temp = n;

        while(temp > 0){
            int ele = temp % 10;

            if(ele >= max){
                secondMax = max;
                max = ele;
            }

            else if(ele > secondMax) secondMax = ele;

            temp /= 10;
        }

        return max * secondMax;
    }
}