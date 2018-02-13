# -*- coding:utf-8 -*-

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int


        题目是找出一个给定字符串可以完成的最大的回文长度。
        整体来看就是要用hashtable那么python中就是直接使用dict()然后再循环中统计每个字幕出现的次数，
        在进行和1的与运算，如果是2的倍数，那么&1的结果一定是1，因为第0位上并没有数，所以结果为1即真的数都是奇数，
        那么如果一个字母只出现了一次就不用算入其中（在结果加1即可，因为可以放一个进去回文），如果大于1的奇数就可以减掉一次加入长度

        @NogizakaZ
        """
        count = dict()
        len = 0
        flag = True
        for i in s:
            count.setdefault(i,0)
            count[i]+=1
        for j in count.values():
            if j & 1:
                len+=j-1
                flag = False
            else:
                len+=j
        return len if flag else len+1





code  = Solution()
s='abccccccadd'
print code.longestPalindrome(s)