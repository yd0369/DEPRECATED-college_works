NUM = (int)(input("Input Number : "))
TMP = NUM
REV = 0
while(TMP > 0):
    REM = TMP % 10
    REV = (REV * 10) + REM
    TMP = TMP // 10
if(NUM == REV) : 
    print("It's a Palindrome Number")
else :
    print("It's not a Palindrome Number")