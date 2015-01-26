'''
Created on Jan 20, 2015

@author: Sushil
'''
import itertools


l = 'ABC'
list = [''.join(p) for p in itertools.permutations(l)]
print(list)