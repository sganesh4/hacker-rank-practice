'''
Created on Oct 25, 2014

@author: Sushil
'''


        

N=int(input())
rows=[]
columns=[]
for i in range(N):
    row, column=map(int, input().split())
    rows.append(row)
    columns.append(column)
print(min(columns)*min(rows))

