# -*- coding: utf-8 -*-
"""
Created on Fri Jan 22 15:06:58 2021
using map function
@author: RajatShukla
"""
from functools import reduce
def movies_starts_with_A(name):
    return name[0] == "A"

movies = ["Andazapnapana","kgf","Arjunreddy","andhadhun"]

#movieswithA=map(movies_starts_with_A,movies)

# resultmap = list(map(lambda s: s[0]=="A",movies))
# print(resultmap)

mov = list(filter(movies_starts_with_A, movies))
print(mov)

resultmap = list(map(lambda s: s[0]=="A",movies))
data = reduce(lambda x,y:x+y, map(lambda x: x+x,filter(lambda x: (x>=3),(1,2,3,4))))

print(data)
