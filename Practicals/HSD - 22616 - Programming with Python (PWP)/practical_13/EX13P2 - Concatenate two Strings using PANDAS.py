import pandas as P
STR_1 = P.DataFrame({'STR1': [input("Input String #1 : ")] })
STR_2 = P.DataFrame({'STR2': [input("Input String #2 : ")] })
print(P.concat([STR_1,STR_2]))