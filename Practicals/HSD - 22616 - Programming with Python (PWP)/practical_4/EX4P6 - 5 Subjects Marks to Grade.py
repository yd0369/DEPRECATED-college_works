SUB_1_MARKS  = (float)(input('Subject #1 Marks : '))
SUB_2_MARKS  = (float)(input('Subject #2 Marks : '))
SUB_3_MARKS  = (float)(input('Subject #3 Marks : '))
SUB_4_MARKS  = (float)(input('Subject #4 Marks : '))
SUB_5_MARKS  = (float)(input('Subject #5 Marks : '))
TOTAL = SUB_1_MARKS + SUB_2_MARKS + SUB_3_MARKS + SUB_4_MARKS + SUB_5_MARKS
PERCENT = (TOTAL / 500) * 100
print('Grade : ',end="")
if(PERCENT > 90)   : print('A')
elif(PERCENT > 70) : print('B')
elif(PERCENT > 50) : print('C')
elif(PERCENT > 30) : print('D')
elif(PERCENT < 30) : print('E')