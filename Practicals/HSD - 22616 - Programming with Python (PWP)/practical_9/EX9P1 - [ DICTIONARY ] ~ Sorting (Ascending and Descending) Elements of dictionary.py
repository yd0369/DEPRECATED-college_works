DICTIONARY = {'One':1,'Three':3,'Five':5,'Two':2,'Four':4}
ASCEND  = sorted(DICTIONARY.items(), key=lambda x: x[1]) 
DESCEND = sorted(DICTIONARY.items(), key=lambda x: x[1], reverse=True) 
print("Ascending  Order :",ASCEND)
print("Descending Order :",DESCEND) 