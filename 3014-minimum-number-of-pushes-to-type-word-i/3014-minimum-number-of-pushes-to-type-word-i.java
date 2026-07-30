class Solution {
    public int minimumPushes(String word) {
        
        int len = word.length();

        int sum = 0, count = 1;

        while(len > 7){
            sum += 8 * count++;
            len -= 8;
        }

        return sum + (len % 8 * count);
    }
}