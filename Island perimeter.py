#!/usr/bin/python
#-*- coding:utf-8 -*-
class Solution(object):
	def islandPerimeter(self, grid):
		"""
		:type grid: List[List[int]]
		:rtype: int
		
		从最简单的模型开始考虑，两个正方形边长是8，如果并在一期边长-2，三个按照直角并在一期-4 所以判断左右上下相邻即可
		@NogizakaZ
		"""
		h = len(grid)
		w = len(grid[0])
		sum=0
		for x in range(h):
			for y in range(w):
				if grid[x][y] ==1:
					sum+=4
					if x > 0 and grid[x-1][y]==1:
						sum-=2
					if y>0 and grid[x][y-1]==1:
						sum-=2
		return sum