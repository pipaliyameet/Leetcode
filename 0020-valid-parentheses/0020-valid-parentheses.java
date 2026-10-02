class Solution {

    int getValue(int ch) {
        switch (ch) {
            case '(': return 1;
            case '{': return 2;
            case '[': return 3;
            case ')': return -1;
            case '}': return -2;
            case ']': return -3;
            default : return 0;
        }
    }

    int[] arr = new int[100000];
    int top = -1;

    void push(int n) {
        arr[++top] = n;
    }

    int pop() {
        if(top == -1) return 0;
        return arr[top--];
    }

    public boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int temp = getValue(c);
            int temp2 =0;
            if (c == '(' || c == '[' || c == '{')  push(temp);

            else {
                if(c==' ') return false;
                temp2 = pop();
                if(( temp2 + temp) != 0 ) return false;
            }
        }
        return top==-1 ;
    }

}