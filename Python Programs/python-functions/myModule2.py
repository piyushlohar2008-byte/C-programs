def palind(num):
    rem = 0
    pal = 0
    temp = num

    while(num != 0):
        rem = num % 10
        pal = (10 * pal) + rem
        num = num // 10
    
    if(temp == pal):
        print("Palind rome")

    else:
        print("Not palind rome")