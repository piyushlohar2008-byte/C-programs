from functools import reduce

a = 10
b = 15
add = lambda x, y: x + y
print(add(a, b))

# Map function-

num1 = [1, 2, 3, 4]
read = list(map(lambda x: x * 2, num1))
print(read)

# Filter function-

num2 = [1, 2, 3, 4, 5]
even = list(filter(lambda x: x % 2 == 0, num2))
print(even)

# Reduce function-

num3 = [2, 4, 6, 8, 10]
add = reduce(lambda x, y: x + y, num3)
print(add)