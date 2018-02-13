# -*- coding:utf-8 -*-

class Solution(object):
    def convertToBase7(self, num):
        """
        :type num: int
        :rtype: str

        base7就是计算给定一个数的7进制，所以就很简单了，用这个数对7进行整除，然后记录每一个值到str中，因为题目中有负数，所以写一个判断
        就行了

        @NogizakaZ
        """
        w=''
        flag = True
        if num ==0 :
            return '0'
        if num < 0:
            flag = False
        while num !=0:
            w = str(abs(num)% 7) +w
            num = abs(num) / 7

        return w if flag else '-'+w


code = Solution()
num = 0
print code.convertToBase7(num)