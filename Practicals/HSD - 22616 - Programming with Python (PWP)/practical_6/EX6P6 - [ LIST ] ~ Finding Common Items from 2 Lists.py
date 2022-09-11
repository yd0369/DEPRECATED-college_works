LIST_1 = [1,2,3,4,5]
LIST_2 = [1,2,3,4,5]
for i in range(0,max(len(LIST_1),len(LIST_2))):
    if(LIST_1[i] == LIST_2[i]):
        print(LIST_1[i])