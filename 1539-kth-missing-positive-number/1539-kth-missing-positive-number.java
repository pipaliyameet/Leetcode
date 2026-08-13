class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int ans = 0;
        int n = arr.length;
        int index = 0;
        int count = 1;

        while(ans<k){
            if(index < n && arr[index] == count) index++;
            else ans++;
            count++;
        }

        return count - 1;
    }
}