# A
print('a.')
for x in range(0,5):
    for y in range(0,x):
        print("*",end="")
    print("")


# B
print('\n\nb.')
for x in range(3):
    print(' '*(3-x-1)+'*'*(2*x+1))
for x in range(2):
    print(' '*(2-x)+'*'*(2*x+1))