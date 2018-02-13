#!/usr/bin/python
s=52
strr=""
while s:
	strr= str(chr((s-1)%26+ord("A"))) + strr
	s=(s-1)/26;
print strr

def aa():
	pass
