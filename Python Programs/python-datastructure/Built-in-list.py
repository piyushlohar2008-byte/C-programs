# Built-in list functions-

l1 = [1, 3, 4, 2, 5]
print(sum(l1))       # display sum of all elements
print(max(l1))       # display max no in list
print(min(l1))       # display min no in list
print(len(l1))       # display length of list
print(sorted(l1))    # sort elements ascending to descending order

# methods of list-

l2 = [2, 7, 8, 1, 9, 3]

print(l2.index(8))   # give index of element
l2.sort()
print(l2)            # sort a elements 
l2.reverse()         # reverse elements in list
print(l2)
l2.clear()           # clear all elements in list
print(l2)

# conclusion- 
# 1)methods are changes original values
# 2)functions can't changes original values