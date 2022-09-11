def PRIME_NUM_CHECK(input):
    if (input > 1) :
        for i in range(2, input//2): 
            if (input % i) == 0: 
                return False
                break
        else: 
            return True
    else: 
        return False

if(PRIME_NUM_CHECK((int)(input("Input Number : ")))) :
    print("It's a Prime Number")
else :
    print("It's not a Prime Number")