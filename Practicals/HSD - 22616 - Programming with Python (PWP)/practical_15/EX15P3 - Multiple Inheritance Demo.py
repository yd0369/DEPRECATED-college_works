class A_CLASS :
    A = 0
    def set_A(self,A) :
        A_CLASS.A = A

class B_CLASS :
    B = 0
    def set_B(self,B) :
        A_CLASS.B = B

class ADD(A_CLASS,B_CLASS):
    def __init__(self,A,B):
        self.set_A(A)
        self.set_B(B)
    
    def SUM_n_DISP(self):
        print("SUM :",(self.A + self.B))

ADD(3,3).SUM_n_DISP()