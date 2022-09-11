class Overloading:

    def form(self,I : int,C : str):
        print(I,C)

    def form(self,C : str,I : int):
        print(C,I)

Overloading().form(3,'yash_desai')