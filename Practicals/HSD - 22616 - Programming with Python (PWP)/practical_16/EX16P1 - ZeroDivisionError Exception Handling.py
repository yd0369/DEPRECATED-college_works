try:
    A = 10 / 0 
except ZeroDivisionError as ERROR :
    print("Can't Divide by 0 :",ERROR)
else :
    print("Result :",A)