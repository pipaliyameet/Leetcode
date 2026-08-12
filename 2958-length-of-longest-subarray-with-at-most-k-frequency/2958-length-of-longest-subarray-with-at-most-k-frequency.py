class Solution(object):
    def maxSubarrayLength(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        
        di = {}
        left = 0
        maxLength = 0

        for right in range(len(nums)):

            di[nums[right]] = di.get(nums[right], 0) + 1

            while di[nums[right]] > k:
                di[nums[left]] -= 1
                left += 1
            
            maxLength = max(maxLength, right - left + 1)

        return maxLength