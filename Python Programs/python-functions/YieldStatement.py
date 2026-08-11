
def My_fun(number):
    for i in range(2, number + 1,  2):
        yield i

for num in My_fun(20):
    print(num)
