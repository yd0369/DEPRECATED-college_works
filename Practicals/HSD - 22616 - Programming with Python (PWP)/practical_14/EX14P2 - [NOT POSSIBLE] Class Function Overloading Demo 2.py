class Area:

    def S_calculate(self,side):
        print("Area of Square :",(side  ** 2))
    
    def R_calculate(self,length,breadth):
        print("Area of Rectangle :",(length*breadth))

Area().S_calculate(4)
Area().R_calculate(4,5) 