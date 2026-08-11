# calculate all arthmetic operators-

def add(a, b):
    return a + b

def sub(a, b):
    return a - b

def div(a, b):
    return a / b

def multi(a, b):
    return a * b

def avg(a, b):
    return (a + b) / 2

# step-2 user input

print("1. Addition")
print("2. Substraction")
print("3. Division")
print("4. Multiplication")
print("5. Average")
num1 = int(input("Enter first number : "))
num2 = int(input("Enter second number : "))
select = int(input("Select operation from 1 to 5 : "))
if(select == 1):
    print(f"{num1} + {num2} = {add(num1, num2)}")
elif(select == 2):
    print(f"{num1} - {num2} = {sub(num1, num2)}")
elif(select == 3):
    print(f"{num1} / {num2} = {div(num1, num2)}")
elif(select == 4):
    print(f"{num1} * {num2} = {multi(num1, num2)}")
elif(select == 5):
    print(f"({num1} + {num2}) / 2 = {avg(num1, num2)}")
else:
    print("Invalid operation! please select again")