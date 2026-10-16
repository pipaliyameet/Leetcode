class Solution(object):
    def numIdenticalPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        di = dict()

        for i in nums:
            if i not in di :
                di[i] = 1
            else : di[i] += 1
        
        sum = 0 

        for i in di :
            n = di[i]
            sum += (n * (n-1)) / 2

        return sum