# Built-in tuple functions-

T1 = (1, 8, 2, 5, 6, 4, 7, 3)
print(len(T1))            # calculate length of tuple
print(sum(T1))            # display sum of all elements
print(max(T1))            # display max no in list
print(min(T1))            # display min no in list
print(tuple(sorted(T1)))  # sort elements ascending to descending order

# Methods-

T2 = (1, 5, 6, 1, 3, 2, 3, 1, 9, 7)
print(T2.index(6))        # give index of element
print(T2.count(1))        # count repetition of element