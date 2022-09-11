TUPLE = ('Zero','One','Two','Three','Four','Five','Six','Seven','Eight','Nine')
NUM = (int)(input("Input Number : "))
REV = 0
while(NUM > 0):
    REM = NUM % 10
    REV = (REV * 10) + REM
    NUM = NUM // 10
NUM = REV
while(NUM > 0):
    print(TUPLE[(int)(NUM%10)], end=" ")
    NUM = (int)(NUM/10)