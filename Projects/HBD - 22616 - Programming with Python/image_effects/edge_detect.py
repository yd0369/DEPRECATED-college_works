import numpy as npy
import cv2 as open_cv
import greetings_msg as msg
import img_import_n_export as __img__

def sobel_horizontal_edge_detect_algo(Image_Raw_Data):
    return open_cv.Sobel(Image_Raw_Data,open_cv.CV_64F,0,1)

def sobel_vertical_edge_detect_algo(Image_Raw_Data):
    return open_cv.Sobel(Image_Raw_Data,open_cv.CV_64F,1,0)

def sobel_bothaxis_bitws_or_edge_detect_algo(Image_Raw_Data):
    return open_cv.bitwise_or(sobel_horizontal_edge_detect_algo(Image_Raw_Data),
        sobel_vertical_edge_detect_algo(Image_Raw_Data))

def sobel_bothaxis_bitws_and_edge_detect_algo(Image_Raw_Data):
    return open_cv.bitwise_and(sobel_horizontal_edge_detect_algo(Image_Raw_Data),
        sobel_vertical_edge_detect_algo(Image_Raw_Data))

def sobel_bothaxis_bitws_xor_edge_detect_algo(Image_Raw_Data):
    return open_cv.bitwise_xor(sobel_horizontal_edge_detect_algo(Image_Raw_Data),
        sobel_vertical_edge_detect_algo(Image_Raw_Data))

def sobel_bothaxis_bitws_not_edge_detect_algo(Image_Raw_Data):
    return open_cv.bitwise_not(sobel_horizontal_edge_detect_algo(Image_Raw_Data),
        sobel_vertical_edge_detect_algo(Image_Raw_Data))

def laplacian_edge_detect_algo(Image_Raw_Data):
    return open_cv.Laplacian(Image_Raw_Data,open_cv.CV_64F)

def canny_edge_detect_algo(Image_Raw_Data,Threshold1,Threshold2):
    return open_cv.Canny(Image_Raw_Data,Threshold1,Threshold2)