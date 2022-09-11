try:
    PASS = input("Enter the Password : ")
    if(PASS != "yash_desai_3") :
        raise Exception("Incorrect_Password_Exception")    
except Exception as ERROR :
    print("Exception :",ERROR)
else :
    print("Password Accepted")
