# Loops in python-

# 1.for loop-

for i in range(1,11):
    print(i)

sum = 0
no = int(input("Enter no : "))
for i in range(1, no + 1):
    sum += i

print("Sum of natural : ", sum)

# while loop-

n = 20
i = 0
while(i <= 20):
    print(i)
    i += 2

# nested loops-

num = 5
for i in range(1, num):
    for j in range(1, num):
        print("*")