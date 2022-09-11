LIST_OF_DICTIONARIES = [{'V':'S001'},{'V':'S002'},{'VI':'S001'},{'VI':'S005'},{'VII':'S005'},{'V':'S009'},{'VIII':'S007'}]
LIST = list()
for DICT in LIST_OF_DICTIONARIES :
    LIST.clear()
    print(DICT,end=" ----> ")
    for key,value in DICT.items() :
            if((LIST.count(value)) == 0) :
                LIST.append(value)
            elif((LIST.count(value)) > 0) :
                LIST.remove(value)
    print(LIST)