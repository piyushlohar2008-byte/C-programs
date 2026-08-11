s1 = int(input("Enter first marks:"))
s2 = int(input("Enter second marks:"))
s3 = int(input("Enter third marks:"))
s4 = int(input("Enter fourth marks:"))

total = s1 + s2 + s3 + s4
per = total / 4

print("Total:", total)
print("Percentage:", per)

if(per >= 75 and per <= 100):
    print("First class")
elif(per >= 60 and per < 75):
    print("Second class")
elif(per >= 40 and per < 60):
    print("Pass")
else:
    print("Fail")