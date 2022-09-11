def STR_PROCESSOR(STR) :
    UPPER_COUNT = 0
    LOWER_COUNT = 0
    for CHAR in STR :
        if(CHAR >= "A" and CHAR <= "Z") :
            UPPER_COUNT+=1
        if(CHAR >= "a" and CHAR <= "z") :
            LOWER_COUNT+=1
    print("Upper Case Characters : ",UPPER_COUNT)
    print("Lower Case Characters : ",LOWER_COUNT)

STR_PROCESSOR("Yash_Desai")