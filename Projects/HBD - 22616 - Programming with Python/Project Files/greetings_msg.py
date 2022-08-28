def intro():
    print("\n\n\n")
    print("[ * ]  Welcome to Yash Desai's PWP Micro-Project....")
    print("[ * ]  Entitled : Image Processing using OpenCV (Python) and Numpy\n")

def urgent_exit():
    print("\n\n[ ! ] Terminating the program execution.....")
    quit()

def greet_exit():
    print("\n\n[ ! ] Thanks for using the program.....")
    urgent_exit()

def preview_image_exit(Window_Name) :
    print(f"[ ! ]  Press any key to close preview window ({Window_Name})...")
    
def processing_img():
    print("\n\n[ ! ]  Processing Image Data. Please Wait.....")