import numpy as npy
import cv2 as open_cv
import greetings_msg as msg
import img_import_n_export as __img__

def bgr_2_hsv(Image_Raw_Data):
    return open_cv.cvtColor(Image_Raw_Data, open_cv.COLOR_BGR2HSV)

def hue_channel_only(Image_Raw_Data):
    msg.processing_img()
    Image_Raw_Data = bgr_2_hsv(Image_Raw_Data)
    for y in range(0, __img__.image_height(Image_Raw_Data)):
        for x in range(0, __img__.image_width(Image_Raw_Data)):
            Image_Raw_Data[y,x,1] = 0
            Image_Raw_Data[y,x,2] = 0
    return Image_Raw_Data

def saturation_channel_only(Image_Raw_Data):
    msg.processing_img()
    Image_Raw_Data = bgr_2_hsv(Image_Raw_Data)
    for y in range(0, __img__.image_height(Image_Raw_Data)):
        for x in range(0, __img__.image_width(Image_Raw_Data)):
            Image_Raw_Data[y,x,0] = 0
            Image_Raw_Data[y,x,2] = 0
    return Image_Raw_Data

def value_channel_only(Image_Raw_Data):
    msg.processing_img()
    Image_Raw_Data = bgr_2_hsv(Image_Raw_Data)
    for y in range(0, __img__.image_height(Image_Raw_Data)):
        for x in range(0, __img__.image_width(Image_Raw_Data)):
            Image_Raw_Data[y,x,0] = 0
            Image_Raw_Data[y,x,1] = 0
    return Image_Raw_Data
