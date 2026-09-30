class Solution {
    public int[] maxDepthAfterSplit(String seq) {

        int index = 0;
        int[] arr = new int[seq.length()];

        Stack<Character> stack = new Stack<>();

        for (char c : seq.toCharArray()) {
            
            if (c == '(') {
                stack.push(c);

                if (stack.size() % 2 == 0) arr[index++] = 1;
                else arr[index++] = 0;
            }

            else {
                if (stack.size() % 2 == 0) arr[index++] = 1;
                else arr[index++] = 0;

                stack.pop();
            }

        }

        return arr; 
    }
}