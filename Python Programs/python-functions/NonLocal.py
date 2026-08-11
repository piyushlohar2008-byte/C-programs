

def Outer():
    x = 5
    def Inner():
        nonlocal x
        x = 10
        print(x)
    Inner()
    print(x)

Outer()