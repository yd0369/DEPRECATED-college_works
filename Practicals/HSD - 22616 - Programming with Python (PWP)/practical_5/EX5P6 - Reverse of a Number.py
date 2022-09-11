NUM = (int)(input("Input Number : "))
REV = 0
while(NUM > 0):
    REM = NUM % 10
    REV = (REV * 10) + REM
    NUM = NUM // 10
print("Reversed Number : ",REV)

