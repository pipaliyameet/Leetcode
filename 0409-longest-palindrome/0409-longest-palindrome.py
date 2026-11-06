class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """

        di = {}

        for ch in s:
            di[ch] = di.get(ch, 0) + 1

        count = 0
        flag = False

        for key in di:
            if(di[key]%2 == 0) :
                count += di[key]
            else :
                count += di[key] - 1
                flag = True

        return (count + 1) if flag else count