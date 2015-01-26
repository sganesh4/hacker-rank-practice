'''
Created on Oct 24, 2014

@author: Sushil
'''
t=int(input())
numbers=[int(input()) for i in range(t)]
divisible_digits=[[ int(x) for x in str(no) if int(x)!=0 and no%int(x)==0] for no in numbers]
print(divisible_digits)
for lst in divisible_digits:
    print(len(lst))