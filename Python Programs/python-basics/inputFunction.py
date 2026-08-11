# Input functions in python

a = input()
print(a+a)

# Input function always read input as a string 
print(int(a)+int(a))   # This is solution for string input

name = input("Enter your name : ")
mark1 = input("Enter mark 1 : ")
mark2 = input("Enter mark 2 : ")
mark3 = input("Enter mark 3 : ")

total = int(mark1) + int(mark2) + int(mark3)
per = total / 3

print(f"Name {name} and percentage is {per}")


# This is program creates empty dictionary and takes user input for name, age, height, and pass/fail status
# Thn stores all the values inside the dictionary and print data

My_dist = {}  # Initialize dictionary

My_dist['name'] = input("Enter your name : ")   
My_dist['Age'] = input("Enter your age : ")
My_dist['Height'] = input("Enter your height : ")
My_dist['isPassed'] = input("Student pass or fail : ")
# Getting all dictionary variables input from user

print(f"Name {My_dist['name']}, age {My_dist['Age']}, height {My_dist['Height']} and it is {My_dist['isPassed']}")