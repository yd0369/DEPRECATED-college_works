# CODE BEFORE
print('# CODE BEFORE')
x=1
while x<10:
    print(x)
    x+=1


# CODE AFTER
print('\n\n# CODE AFTER')
for x in range(1,10):
    print(x)