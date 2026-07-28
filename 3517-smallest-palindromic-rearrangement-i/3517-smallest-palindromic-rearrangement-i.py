class Solution(object):
    def smallestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        count = dict()

        for i in range(len(s)):
            if s[i] not in count : count[s[i]] = 1
            else : count[s[i]] += 1

        left = ""
        middle = ""

        for ch in sorted(count.keys()):

            if count[ch] % 2 == 1 : 
                middle = ch

            left += ch * (count[ch] // 2)

        return left + middle + left[::-1]


