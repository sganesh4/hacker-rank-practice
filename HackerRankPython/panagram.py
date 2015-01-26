'''
Created on Nov 17, 2014

@author: Sushil
'''
s=input()
s=sorted(set(s.replace(' ', '').lower()))
if ''.join(s)=='abcdefghijklmnopqrstuvwxyz':
    print('pangram')
else:
    print('not pangram')