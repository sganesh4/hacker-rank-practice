'''
Created on Oct 24, 2014

@author: Sushil
'''
import itertools
def lastStone(curStone,addStone,n,a,b, last_stone):
    if curStone==n:
        last_stone.append(int(addStone))
        return
    curStone=curStone+1
    lastStone(curStone, addStone+a, n, a,b,last_stone)
    lastStone(curStone,addStone+b, n, a, b, last_stone)  
  
t=int(input())
testCases=[[ int(input()) for j in range(3)] for i in range(t)]
for x in testCases:
    z=["".join(seq) for seq in itertools.product(str(x[0])+str(x[1]), repeat=x[0])]
    print(z)
