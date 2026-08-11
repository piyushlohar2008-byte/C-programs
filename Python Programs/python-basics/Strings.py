# Strings in python

name = "Piyush"    # Creating a string
print(name)

print(type(name))

print('Hello "World"')   # use of single quotes
print("It's easy")   # double quotes

print('''"kw-double Quotes" ''')

# formatted strings insert variables or expressions
# 1. Old style format - % operator

name = "shraddha"
age = 25

print("My name is %s and i am %d years old" % (name,age))

# 2. str.format() method

name = "piyush"
age = 17
# print("My name is {} and i am {}".format(name,age))

# you can reference variable by index or keyword
print("My name is {0} and i am {1}".format(name,age))
print("My name is {1} and i am {0}".format(name,age))

print("My name is {name} and i am {age}".format(name = "Ram",age = 23))

# f-strings

book = "Jungle_book"
cost = 4500

print(f"The {book} purchases is {cost} rupess.")