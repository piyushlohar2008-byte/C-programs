# Conditional statement in python

# if statement-
a = 27
b = 75
if b > a:
    print("b is greater than a")

age = int(input("Enter your age : "))
if age > 18:
    print("You can vote")

# if-else statement-
Age = int(input("Enter your age : "))
if Age > 18:
    print("You can eligible to vote")
else:
    print("You cannot eligible to vote") 


# if-elif-else ladder statement-
per = int(input("Enter your percentage : "))
if (per>=80 and per<=100):
    print("First class")
elif (per>=60 and per<=80):
    print("Second class")
elif (per>=40 and per<=60):
    print("Pass")
else:
    print("Fail")


#4. Nested if-else stament-
x = 45
y = 18
z = 8
if(x > y):
    if(x > z):
        print("X is greater")
    else:
        print("Z is greater")

else:
    if(y > z):
        print("Y is greater")
    else:
        print("Both are same ")