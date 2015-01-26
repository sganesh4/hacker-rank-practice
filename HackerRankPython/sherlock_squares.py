'''
Created on Nov 1, 2014

@author: Sushil
'''
import math

T=int(input())
pairs=[list(map(int, input().split())) for i in range(T)]

for x in pairs:
    no_of_squares=int(math.floor(math.sqrt(x[1])) - math.ceil(math.sqrt(x[0])) +1)
    print(no_of_squares)