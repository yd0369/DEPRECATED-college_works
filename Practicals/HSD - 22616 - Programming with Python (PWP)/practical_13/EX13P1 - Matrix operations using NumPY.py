import numpy as NP
X = (int) (input("X : "))
Y = (int) (input("Y : "))
MAT = list()
for i in range(2) :
    MAT.append("")
    print("\n\nFill the Matrix",i+1,":\n")
    for x in range(X) :
        for y in range(Y) :
            print("[" , x , ":" , y , "] : ",end="")
            MAT[i] += (" " + (input()) + " ")
        else :
            if(x != (X-1)) :
                MAT[i] += (" ; ")

print("\n\nMatrix 0 :\n",NP.matrix(MAT[0]))
print("\n\nMatrix 1 :\n",NP.matrix(MAT[1]))
ADD_MAT = NP.matrix( NP.matrix(MAT[0]) + NP.matrix(MAT[1]) ) 
SUB_MAT = NP.matrix( NP.matrix(MAT[0]) - NP.matrix(MAT[1]) ) 
MUL_MAT = NP.matrix( NP.matrix(MAT[0]) * NP.matrix(MAT[1]) ) 
DIV_MAT = NP.matrix( NP.matrix(MAT[0]) / NP.matrix(MAT[1]) ) 
print("\n\nAddition (Matrix 0 + Matrix 1) :\n",ADD_MAT)
print("\n\nSubtraction (Matrix 0 - Matrix 1) :\n",SUB_MAT)
print("\n\nMultiplication (Matrix 0 * Matrix 1) :\n",MUL_MAT)
print("\n\nDivision (Matrix 0 / Matrix 1) :\n",DIV_MAT)