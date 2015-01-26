'''
Created on Nov 1, 2014

@author: Sushil
'''

T=int(input())
test_cases=[]
for i in range(T):
    n=int(input())
    test_cases.append(list(map(int, input().split())))
print(test_cases)