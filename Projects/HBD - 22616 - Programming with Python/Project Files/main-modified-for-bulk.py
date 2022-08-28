import greetings_msg as msg
import cv2 as open_cv
msg.intro()

import prerequisites_checker
import img_import_n_export as __img__
import image_effects.edge_detect as edge_detect
import image_effects.hsv_color_space as effects_hsv
import image_effects.luv_color_space as effects_luv
import image_effects.rgb_color_space as effects_rgb


count = 0
def export_image(Image_Raw_Data) :
    print("[ ! ]  Exporting as an Image..")
    img_export_name = f"exported_image_files/mona_lisa-{count}.jpg"
    open_cv.imwrite(img_export_name, Image_Raw_Data)



# img_raw_data = open_cv.imread("./c.jpg")
    

count=count+1
export_image(effects_rgb.bgr_2_rgb(open_cv.imread("./c.jpg")))
count=count+1
export_image(effects_rgb.bgr_2_rgba(open_cv.imread("./c.jpg")))
count=count+1
export_image(effects_rgb.grayscale_image(open_cv.imread("./c.jpg")))
count=count+1
export_image(effects_rgb.red_channel_only(open_cv.imread("./c.jpg")))
count=count+1
export_image(effects_rgb.green_channel_only(open_cv.imread("./c.jpg")))
count=count+1
export_image(effects_rgb.blue_channel_only(open_cv.imread("./c.jpg")))
threshold = int(input("\n[ ? ]  Threshold Value : "))
count=count+1
export_image(effects_rgb.custom_rgb_threshold(open_cv.imread("./c.jpg"),threshold))
r_threshold = int(input("\n[ ? ]  Red Threshold Value : "))
g_threshold = int(input("[ ? ]  Green Threshold Value : "))
b_threshold = int(input("[ ? ]  Blue Threshold Value : "))
count=count+1
export_image(effects_rgb.custom_rgb_gain_or_loss(open_cv.imread("./c.jpg"),r_threshold,
                        g_threshold,b_threshold))
count=count+1
export_image(effects_hsv.bgr_2_hsv(open_cv.imread("./c.jpg")))
count=count+1
export_image(effects_hsv.hue_channel_only(open_cv.imread("./c.jpg")))
count=count+1
export_image(effects_hsv.saturation_channel_only(open_cv.imread("./c.jpg")))
count=count+1
export_image(effects_hsv.value_channel_only(open_cv.imread("./c.jpg")))
count=count+1
export_image(effects_luv.bgr_2_luv(open_cv.imread("./c.jpg")))
count=count+1
export_image(effects_luv.luminance_component_only(open_cv.imread("./c.jpg")))
count=count+1
export_image(effects_luv.u_chroma_component_only(open_cv.imread("./c.jpg")))
count=count+1
export_image(effects_luv.v_chroma_component_only(open_cv.imread("./c.jpg")))
count=count+1
export_image(edge_detect.sobel_horizontal_edge_detect_algo(open_cv.imread("./c.jpg")))
count=count+1
export_image(edge_detect.sobel_vertical_edge_detect_algo(open_cv.imread("./c.jpg")))
count=count+1
export_image(edge_detect.sobel_bothaxis_bitws_or_edge_detect_algo(open_cv.imread("./c.jpg")))
count=count+1
export_image(edge_detect.sobel_bothaxis_bitws_and_edge_detect_algo(open_cv.imread("./c.jpg")))
count=count+1
export_image(edge_detect.sobel_bothaxis_bitws_xor_edge_detect_algo(open_cv.imread("./c.jpg")))
count=count+1
export_image(edge_detect.sobel_bothaxis_bitws_not_edge_detect_algo(open_cv.imread("./c.jpg")))
count=count+1
export_image(edge_detect.laplacian_edge_detect_algo(open_cv.imread("./c.jpg")))
threshold_a = int(input("\n[ ? ]  Threshold A Value : "))
threshold_b = int(input("[ ? ]  Threshold B Value : "))
count=count+1
export_image(edge_detect.canny_edge_detect_algo(open_cv.imread("./c.jpg"),threshold_a,threshold_b))