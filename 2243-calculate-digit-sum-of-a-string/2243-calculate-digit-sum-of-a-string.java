class Solution {
    public String digitSum(String s, int k) {
        
        String ans = s;

        while(ans.length() > k){
            
            String temp = "";

            for(int i = 0 ;i < ans.length(); i += k){

                String group = ans.substring(i, Math.min(i + k, ans.length()));

                int sum = 0;

                for (int j = 0; j < group.length(); j++) sum += group.charAt(j) - '0';

                temp += sum;
            }

            ans = temp;
        }

        return ans;
    }
}