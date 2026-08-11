# String operators in python

a = "Hello"
b = "Python"

print(a+b)   # concatenate string
print(a*3)   # multiple -copies

if "H" in a:
    print("Yes")
else:
    print("No")

if "H" not in a:
    print("Yes")
else:
    print("No")

print(r"Hello\nworld")      # Raw -string


# String indexes- used to access individual character
subject = "PYTHON"

print(subject[0])      # positive index
print(subject[-4])     # negative index

# printing all character using indexing

print(subject[0])
print(subject[1])
print(subject[2])
print(subject[3])
print(subject[4])
print(subject[5])

# string slicing

acc_holder = "MADHAV"

# start: (inclusive) default value is 0
# end: (exclusive) default value is length of string
# step: how much to increment the index after each character

print(acc_holder[0:4])  # first three character
print(acc_holder[0:5:2])
print(acc_holder[-4:])  # last four character
print(acc_holder[::-1]) # reverse string