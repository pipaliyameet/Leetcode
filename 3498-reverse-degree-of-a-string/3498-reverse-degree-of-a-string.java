class Solution {

    private static int findIndex(char[] arr, char target) {
        return IntStream.range(0, arr.length)
                        .filter(i -> arr[i] == target)
                        .findFirst()
                        .orElse(-1);
    }

    public int reverseDegree(String s) {
        
        int sum = 0;

        char[] arr = {
            'z','y','x','w','v','u','t','s','r','q','p','o',
            'n','m','l','k','j','i','h','g','f','e','d','c','b','a'
        };

        for(int i = 0; i<s.length(); i++) sum += (findIndex(arr, s.charAt(i)) + 1) * (i + 1);

        return sum;
    }
}