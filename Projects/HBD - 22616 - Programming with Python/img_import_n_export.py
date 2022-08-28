import numpy as npy
import cv2 as open_cv 
import greetings_msg as msg

def import_image() :
    print("[ ! ]  Importing an Image..")
    img_location = input("[ ? ]  Image Location : ")
    img_raw_data = open_cv.imread(img_location)
    if input("[ ? ]  Preview Imported Image (y/n) : ")=='y':
        preview_image("Imported Image",img_raw_data)
    return img_raw_data

def export_image(Image_Raw_Data) :
    print("[ ! ]  Exporting as an Image..")
    img_export_name = input("[ ? ]  Save as File Name (with ext.) : ")
    img_export_name = "exported_image_files/" + img_export_name
    if open_cv.imwrite(img_export_name, Image_Raw_Data) :
        print("\n\n[ \u2605 ]  Image Successfully Exported")
    else :
        print("\n\n[ X ]  Image Couldn't be Exported")

def preview_image(Window_Name,Image_Raw_Data) :
    open_cv.imshow(Window_Name,Image_Raw_Data)
    msg.preview_image_exit(Window_Name)
    open_cv.waitKey(0)
    open_cv.destroyAllWindows()
    return Image_Raw_Data
    
def image_resolution(Image_Raw_Data) :
    img_height = int(Image_Raw_Data.shape[0])
    img_width  = int(Image_Raw_Data.shape[1])
    print("Image Resolution : ")
    print(f"Height : {img_height} Pixels")
    print(f"Width : {img_width} Pixels")

def image_height(Image_Raw_Data):
    return int(Image_Raw_Data.shape[0])

def image_width(Image_Raw_Data):
    return int(Image_Raw_Data.shape[1])
