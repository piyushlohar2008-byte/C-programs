# Operators in python

# 1. Arthmetic operators:

a = 25
b = 10

# This program demenstrate all arthmetic operators in python
# Perform all operations to show how each operators works and what result is produces
print(a+b)  # Addition operator
print(a-b)  # Substraction operator
print(a*b)  # Multiplication operator
print(a/b)  # Division operator
print(a%b)  # Mudulas operator 

# 2. Comparison operators:

x = 45
y = 18

# This program demenstrate all comparison operators in python
print(x>y)   # Greater than operator
print(x<y)   # Less than operator
print(x>=y)  # Greater than or equal to operator
print(x<=y)  # Less than or equal to operator
print(x==y)  # equal operator
print(x!=y)  # Not equal to operator

# 3. Assignment operators
a = 5
a+=5         # also written as a = a + 5
a-=6         # also written as a = a - 5
a*=20        # also written as a = a * 5
a/=10        # also written as a = a / 5
print(a)

# 4. Logical operators
a = 10
b = 20

print(a>10 and b>10)    # and operator
print(a==10 or b==10)   # or operator
print(not(a>10 and b<10))   # not operator reverse output

# 5. Identity operators- is, is not 
x = [1,2,3]
y = x
z = [1,2,3]

print(x is y)         # is operator check address not value
print(x is not z)     # is not operator reverse output same as not operator
print(x is z)

# 6. Membership operators- in, not in
my_list = ["apple", "mango", "banana", "kiwi"]

print("apple"in my_list)     # in operator check string present in list or not
print("apple"not in my_list) # not in operator reverse output
print("orange"in my_list)

# 7. Bitwise operators- AND(&), OR(|), XOR

p = 5            # binary of 5 =   0101
q = 3            # binary of 3 =   0011
print(p & q)     
# AND operator
# binary output =  0001 means gives output 1