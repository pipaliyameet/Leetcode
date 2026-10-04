class Solution {
    public boolean isPalindrome(int x) {

        int orignelNumber=x;
        int remainder =0;
        int revers =0;
        for(int temp=x ;temp>0 ;temp=(temp/10)){
            remainder = (temp%10);
            revers = ((revers*10)+remainder);
        }
        if(revers==orignelNumber){
            return true;
        }
        else{
            return false;
        }
    }
}