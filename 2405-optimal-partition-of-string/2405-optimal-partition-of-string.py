class Solution:
    def partitionString(self, s: str) -> int:
        
        ans = 1
        li = []
        
        for i in s:
            if i in li : 
                li = [i]
                ans += 1
            else : li += [i]
        
        return ans