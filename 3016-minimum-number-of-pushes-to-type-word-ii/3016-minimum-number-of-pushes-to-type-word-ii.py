class Solution(object):
    def minimumPushes(self, word):
        """
        :type word: str
        :rtype: int
        """

        di = dict()

        se = set()

        for i in word:
            se.add(i)

        for i in se:
            di[i] = word.count(i)

        li = sorted(di.items(), key=lambda x: x[1])

        ans = 0
        multiply = 1

        index = len(li) - 1
        counter = 0

        while index > -1:
            ans += li[index][1] * multiply

            counter += 1

            if counter == 8:
                counter = 0
                multiply += 1

            index -= 1

        return ans