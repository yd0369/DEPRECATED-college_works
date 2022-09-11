class Employee:

    def get_n_disp_info(self):
        print("Name :",self.NAME)
        print("Department :",self.DEPARTMENT)
        print("Salary :",self.SALARY)

E1 = Employee()
E1.NAME = "Yash Desai"
E1.DEPARTMENT = "Research and Development"
E1.SALARY = 0
E1.get_n_disp_info()