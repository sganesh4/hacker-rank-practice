'''
Created on Oct 25, 2014

@author: Sushil
'''
def cross(a, b):
    c = [a[1]*b[2] - a[2]*b[1],
         a[2]*b[0] - a[0]*b[2],
         a[0]*b[1] - a[1]*b[0]]

    return c
T=int(input())
points=[]
for i in range(T):
    points1=[]
    for j in range(4):
        x, y, z=map(int, input().split())
        points1.append(x)
        points1.append(y)
        points1.append(z)
    points.append(points1)
        
for x in points:
    e1=[x[3]-x[0],  x[4]-x[1], x[5]-x[2]]
    e2=[x[6]-x[3],  x[7]-x[4], x[8]-x[5]]
    d=[x[9]-x[0],  x[10]-x[1], x[11]-x[2]]
    cross_prod=cross(e1,e2)
    dot_prod=sum([d[i]*cross_prod[i] for i in range(3)])
    if dot_prod==0:
        print('YES')
    else:
        print('NO')
    
    