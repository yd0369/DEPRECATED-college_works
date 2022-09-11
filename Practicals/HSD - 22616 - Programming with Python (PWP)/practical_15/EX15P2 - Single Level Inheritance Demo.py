class STUDENT:
    SERIAL= 0

class Information(STUDENT):
    def __init__(self,NAME,CLASS):
        STUDENT.SERIAL+=1
        self.NAME = NAME
        self.CLASS = CLASS

    def disp_info(self):
        print("\nSerial Number :",self.SERIAL)
        print("Name :",self.NAME)
        print("Class :",self.CLASS)

Information("Yash Desai","2 Year").disp_info()
Information("Sam Mural","3 Year").disp_info()