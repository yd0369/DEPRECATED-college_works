DICTIONARY = {1: 10, 2: 20, 3: 30, 4: 40, 5: 50, 6: 60}
LIST = list()
for key,value in DICTIONARY.items() :
    if((LIST.count(value)) == 0) :
        LIST.append(value)
for i in range(3) :
    print(max(LIST))
    LIST.remove(max(LIST))