class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """

        dit = Counter(t)
        dis = Counter(s)

        for key in dit :
            if dit[key] != dis[key] : return key
