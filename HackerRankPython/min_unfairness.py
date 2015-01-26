'''
Created on Oct 24, 2014

@author: Sushil
'''
N=int(input())
K=int(input())
candy_packs=[int(input()) for j in range(N)]
candy_packs.sort(key=None, reverse=False)
j=0
unfairness=[candy_packs[j+K-1]-candy_packs[j] for j in range(N-K+1)]
print(min(unfairness))
    