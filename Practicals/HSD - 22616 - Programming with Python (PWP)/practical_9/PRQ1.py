dictionary = {'MSBTE' : 'Maharastra State Board of Technical Education',
              'CO' : 'Computer Enginnering',
              'SEM' : 'Sixth'}
del dictionary['CO'];
for key,values in dictionary.items() :
    print(key)
dictionary.clear();
for key,values in dictionary.items() :
    print(key)
del dictionary;
for key,values in dictionary.items() :
    print(key)
