DICTIONARY_1 = {'a':100,'b':200,'c':300}
DICTIONARY_2 = {'a':300,'b':200,'d':400}
DICTIONARY = dict()
DICTIONARY.update(DICTIONARY_1)
DICTIONARY.update(DICTIONARY_2)
print(DICTIONARY)