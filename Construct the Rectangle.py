# -*- coding:utf-8 -*-
import math
class Solution(object):
    def constructRectangle(self, area):
        """
        :type area: int
        :rtype: List[int]

        计算面积，首先一开始的想法是从1开始做除法，找到所有能够整除的组合，然后判断哪一组的difference最小。
        解法的一种是首先求出面积平方根然后取正赋值到mid，然后mid值不断减少,用area整除mid，这样的到的第一组数据就是最大的

        @NogizakaZ
        """
        mid = int(math.sqrt(area))
        while mid > 0:
            if area % mid == 0:
                return [int(area/mid),int(mid)]
            mid-=1


code = Solution()
area=12
code.constructRectangle(area)
print int(math.sqrt(10))
