# basic list operation-

list1 = [1, 2, 3, 4, 5]
# adding new element in list-

list1.append(6)     # insert at end
list1.append(7)
list1.insert(7, 8)  # insert at perticuler index

print(list1)

# removing elements-
del list1[1]        # index delete
list1.remove(5)     # remove perticuler element
list1.pop()         # delete last element

print(list1)

# operations-

x = [10, 20, 30]
print(len(x))       # calculate length of list

y = [40, 50]
z = x + y

print(z)            # combine two lists

print(x * 2)        # repetition of list
a = [1, 3, 5, 2, 6, 2, 7, 9, 1, 2, 6, 8, 2]

print(a.count(2))   # count repetition of element