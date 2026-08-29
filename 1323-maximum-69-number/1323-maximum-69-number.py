class Solution(object):
    def maximum69Number (self, num):
        """
        :type num: int
        :rtype: int
        """
        num = str(num)

        if '6' in num : 
            index = num.index('6')
            return int(num[:index] + '9' + num[index+1:])

        return int(num)