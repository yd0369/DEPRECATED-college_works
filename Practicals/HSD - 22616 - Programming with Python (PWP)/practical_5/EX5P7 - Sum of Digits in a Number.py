NUM = (int)(input("Input Number : "))
SUM = 0
while(NUM > 0):
    SUM += (NUM % 10)
    NUM = NUM // 10
print("Sum of Digits : ",SUM)