# -*- coding:utf-8 -*-

class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int

        这个题是说给一个数组，找出里面出现次数最多的元素，然后条件是这个元素出现的次数大于整个数组长度的一般。
        那么解法就很简单了，首先用任意排序算法给这个数组进行排序，如果那个元素出现次数大于长度一半，那么这个元素一定会出现在数组
        一般的位置，所以直接取len/2就行了，我写了冒泡排序(超时了= =)，也可以调用标准库里面的排序算法

        一行解
        return sorted(nums)[len(nums)/2]

        @NogizakaZ
        """

        temp = 0
        for i in range(0,len(nums)):
            j=i
            for j in range(j,len(nums)):
                if nums[i] >= nums[j]:
                    temp = nums[j]
                    nums[j] = nums[i]
                    nums[i]=temp
        return nums[len(nums)/2]






code = Solution()
nums = [3,2,3,3,3,4,1,5,6,7,8,3,3]
print code.majorityElement(nums)