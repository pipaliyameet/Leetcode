class Solution {
    public boolean checkString(String s) {
        
        for(int i = 0; i < s.length()-1; i++){
            int first = s.charAt(i) == 'a' ? 0 : 1;
            int second = s.charAt(i + 1) == 'a' ? 0 : 1;

            if(first > second) return false;
        }

        return true;
    }
}