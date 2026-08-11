# functions in python-


# simple function without parameter-
def greeting():
    print("Welcome to python programming")

# function to add two numbers & print result with parameter-
def getinfo(a, b):
    result = a + b                  # perform addition and store result
    print("The sum is : ",result)

# call the functions (use function)-

greeting()
getinfo(45,18)   # -arguments
getinfo(a=10,b=33)  # also written as argument with variable

# create function for cube of any number
def cube(x):
    result = x * x * x
    print(f"Cube of {x} is {result}")

cube(5)  # call function

# function with return statement-
def division(x, y):
    return x / y

result =  division(49, 7)   # store return value and result
print(result)

# pass statement-

def Empty():       # define empty function
    pass           # it is used to write a code added later (or access later) 

print("Hello").