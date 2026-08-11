# arguments in python-
  
def greeting(name):              # name is oparameter
    print("Hello",name,"!")

greeting("piyush")    # piyush is argument

# 2. default argument-
def input(course_name = "Python", course_by = "Piyush"):          # assign value in declaration of variable
    print("welcome to",course_name,"programming, by",course_by)

input()  # call function

# 3. keyword argument-

def divide(a,b):
    return a / b

result1 = divide(100,20)
print(result1)

result2 = divide(a = 20,b = 100)   # named argument (keyword argument)
print(result2)

# 4. arbitrary argument-
# arbitrary is positional argument(*arbitrary)

def add_numbers(*args):
    print(type(args))
    return sum(args)

result = add_numbers(1,2,3,4)   # variable numbers of argument 
print("Addition of multiple numbers:",result)

def greet(*names):
    for name in names:   
        print("Hello",name)   # print names using for loop

greet("Piyush","Aditya","Aryan","Raj")
