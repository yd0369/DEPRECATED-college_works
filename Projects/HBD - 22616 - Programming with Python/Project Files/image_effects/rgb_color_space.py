import numpy as npy
import cv2 as open_cv
import greetings_msg as msg
import img_import_n_export as __img__

def grayscale_image(Image_Raw_Data):
    return open_cv.cvtColor(Image_Raw_Data, open_cv.COLOR_BGR2GRAY)

def bgr_2_rgb(Image_Raw_Data):
    return open_cv.cvtColor(Image_Raw_Data, open_cv.COLOR_BGR2RGB)

def bgr_2_rgba(Image_Raw_Data):
    return open_cv.cvtColor(Image_Raw_Data, open_cv.COLOR_BGR2RGBA)

def blue_channel_only(Image_Raw_Data):
    msg.processing_img()
    for y in range(0, __img__.image_height(Image_Raw_Data)):
        for x in range(0, __img__.image_width(Image_Raw_Data)):
            Image_Raw_Data[y,x,1] = 0
            Image_Raw_Data[y,x,2] = 0
    return Image_Raw_Data

def green_channel_only(Image_Raw_Data):
    msg.processing_img()
    for y in range(0, __img__.image_height(Image_Raw_Data)):
        for x in range(0, __img__.image_width(Image_Raw_Data)):
            Image_Raw_Data[y,x,0] = 0
            Image_Raw_Data[y,x,2] = 0
    return Image_Raw_Data

def red_channel_only(Image_Raw_Data):
    msg.processing_img()
    for y in range(0, __img__.image_height(Image_Raw_Data)):
        for x in range(0, __img__.image_width(Image_Raw_Data)):
            Image_Raw_Data[y,x,0] = 0
            Image_Raw_Data[y,x,1] = 0
    return Image_Raw_Data

def custom_rgb_threshold(Image_Raw_Data,threshold_factor=0):  
    msg.processing_img()
    for y in range(0, __img__.image_height(Image_Raw_Data)):
        for x in range(0, __img__.image_width(Image_Raw_Data)):
            if (Image_Raw_Data[y,x] >= threshold_factor).any() :
                Image_Raw_Data[y,x] = 255
            else:
                Image_Raw_Data[y,x] = 0
    return Image_Raw_Data

def custom_rgb_gain_or_loss(Image_Raw_Data,R_factor=0,G_factor=0,B_factor=0):  
    msg.processing_img()
    for y in range(0, __img__.image_height(Image_Raw_Data)):
        for x in range(0, __img__.image_width(Image_Raw_Data)):
            if Image_Raw_Data[y,x,0] >= B_factor :
                Image_Raw_Data[y,x,0] = 255
            else:
                Image_Raw_Data[y,x,0] = 0

            if Image_Raw_Data[y,x,1] >= G_factor :
                Image_Raw_Data[y,x,1] = 255
            else:
                Image_Raw_Data[y,x,1] = 0
            
            if Image_Raw_Data[y,x,2] >= R_factor :
                Image_Raw_Data[y,x,2] = 255
            else:
                Image_Raw_Data[y,x,2] = 0
    return Image_Raw_Data