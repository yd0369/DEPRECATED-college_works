YEAR  = (float)(input('Input Year : '))
if(((YEAR % 4 == 0) and (YEAR % 100!= 0)) or (YEAR%400 == 0)) : 
    print('It\'s a Leap Year')
else : 
    print('It\'s not a Leap Year')
