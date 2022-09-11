def FACTORIAL(input):
    FACT = 1
    while(input > 0) :
        FACT *= input
        input-=1
    return FACT

print("Factorial : ",(FACTORIAL((int)(input("Input Number : ")))))
