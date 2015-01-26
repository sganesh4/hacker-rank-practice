'''
Created on Nov 17, 2014

@author: Sushil
'''
from collections import Counter
M=int(input())
m_array=list(map(int, input().split()))
c1 = Counter(m_array)
N=int(input())
n_array=list(map(int, input().split()))
c2 = Counter(n_array)
diff = c2 - c1
ans = list(set(diff.elements()))
ans.sort()
for x in ans:
    print(x,end=" ")