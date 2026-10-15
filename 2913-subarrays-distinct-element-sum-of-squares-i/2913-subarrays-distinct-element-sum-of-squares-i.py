class Solution(object):
    def sumCounts(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """ 
        li = []
        for i in range(len(nums)+1) :
            for j in range(i, len(nums)+1) :
                li.append(len(set(nums[i:j]))**2)
        
        return sum(li)