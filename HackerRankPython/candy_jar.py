'''
Created on Nov 1, 2014

@author: Sushil
'''
N, M=map(int, input().split())
ops=[list(map(int, input().split())) for i in range(M)]
var=0
for x in ops:
    var=var+(x[1]-x[0]+1)*x[2]
print(int(var/N))