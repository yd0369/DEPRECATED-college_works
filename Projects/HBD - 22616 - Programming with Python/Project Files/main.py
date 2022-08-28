import greetings_msg as msg

msg.intro()

import prerequisites_checker
import img_import_n_export as __img__
import image_effects.edge_detect as edge_detect
import image_effects.hsv_color_space as effects_hsv
import image_effects.luv_color_space as effects_luv
import image_effects.rgb_color_space as effects_rgb
raw_img_data = __img__.import_image()
I = raw_img_data

operations_tuple = (
    "Yash Desai - Empty Space",
    "Convert Image Data from OpenCV's BRG to RGB",
    "Convert Image Data from OpenCV's BRG to RGBA",
    "Convert Image to Grayscale Image",
    "Extract Red Channel from Image RGB values",
    "Extract Green Channel from Image RGB values",
    "Extract Blue Channel from Image RGB values",
    "Set custom Image Threshold",
    "Set custom Image Individual RGB Threshold",
    "[HSV] Convert Image Data from OpenCV's BRG to HSV",
    "[HSV] Extract Hue Channel from Image HSV values",
    "[HSV] Extract Saturation Channel from Image HSV values",
    "[HSV] Extract Value Channel from Image HSV values",
    "[LUV] Convert Image Data from OpenCV's BRG to LUV",
    "[LUV] Extract Luminance Component from Image LUV values",
    "[LUV] Extract U Chroma Color Component from Image LUV values",
    "[LUV] Extract V Chroma Color Component from Image LUV values",
    "[SOBEL E.D. ALGO] Based on Horizontal Axis",
    "[SOBEL E.D. ALGO] Based on Vetical Axis",
    "[SOBEL E.D. ALGO] Based on Bitwised OR",
    "[SOBEL E.D. ALGO] Based on Bitwised AND",
    "[SOBEL E.D. ALGO] Based on Bitwised XOR",
    "[SOBEL E.D. ALGO] Based on Bitwised NOT",
    "[Laplacian E.D. ALGO]",
    "[Canny E.D. ALGO] Based on Custom Thresholds",
    "Change image file Format",
    "Get Image Height and Width"
)

count = 0
print("\n\n[ ? ]  Enter the operation # you would like to perform on the image : \n")
for operation_name in operations_tuple:
    if(count == 0) : 
        count+=1
        continue
    print(f"  +---  {count} -> {operation_name}")
    count+=1 

SELECT = int(input("\nEnter the Operation # (1-25) : "))

if SELECT < 1 or SELECT > 26 :
    print("[ X ]  Invalid Input")
    msg.urgent_exit()
else :
    if SELECT == 1:
        I = __img__.preview_image(operations_tuple[SELECT],effects_rgb.bgr_2_rgb(raw_img_data))
    elif SELECT == 2:
        I = __img__.preview_image(operations_tuple[SELECT],effects_rgb.bgr_2_rgba(raw_img_data))
    elif SELECT == 3:
        I = __img__.preview_image(operations_tuple[SELECT],effects_rgb.grayscale_image(raw_img_data))
    elif SELECT == 4:
        I = __img__.preview_image(operations_tuple[SELECT],effects_rgb.red_channel_only(raw_img_data))
    elif SELECT == 5:
        I = __img__.preview_image(operations_tuple[SELECT],effects_rgb.green_channel_only(raw_img_data))
    elif SELECT == 6:
        I = __img__.preview_image(operations_tuple[SELECT],effects_rgb.blue_channel_only(raw_img_data))
    elif SELECT == 7:
        threshold = int(input("\n[ ? ]  Threshold Value : "))
        I = __img__.preview_image(operations_tuple[SELECT],effects_rgb.custom_rgb_threshold(raw_img_data,threshold))
    elif SELECT == 8:
        r_threshold = int(input("\n[ ? ]  Red Threshold Value : "))
        g_threshold = int(input("[ ? ]  Green Threshold Value : "))
        b_threshold = int(input("[ ? ]  Blue Threshold Value : "))
        I = __img__.preview_image(operations_tuple[SELECT],effects_rgb.custom_rgb_gain_or_loss(raw_img_data,r_threshold,
                        g_threshold,b_threshold))
    elif SELECT == 9:
        I = __img__.preview_image(operations_tuple[SELECT],effects_hsv.bgr_2_hsv(raw_img_data))
    elif SELECT == 10:
        I = __img__.preview_image(operations_tuple[SELECT],effects_hsv.hue_channel_only(raw_img_data))
    elif SELECT == 11:
        I = __img__.preview_image(operations_tuple[SELECT],effects_hsv.saturation_channel_only(raw_img_data))
    elif SELECT == 12:
        I = __img__.preview_image(operations_tuple[SELECT],effects_hsv.value_channel_only(raw_img_data))
    elif SELECT == 13:
        I = __img__.preview_image(operations_tuple[SELECT],effects_luv.bgr_2_luv(raw_img_data))
    elif SELECT == 14:
        I = __img__.preview_image(operations_tuple[SELECT],effects_luv.luminance_component_only(raw_img_data))
    elif SELECT == 15:
        I = __img__.preview_image(operations_tuple[SELECT],effects_luv.u_chroma_component_only(raw_img_data))
    elif SELECT == 16:
        I = __img__.preview_image(operations_tuple[SELECT],effects_luv.v_chroma_component_only(raw_img_data))
    elif SELECT == 17:
        I = __img__.preview_image(operations_tuple[SELECT],edge_detect.sobel_horizontal_edge_detect_algo(raw_img_data))
    elif SELECT == 18:
        I = __img__.preview_image(operations_tuple[SELECT],edge_detect.sobel_vertical_edge_detect_algo(raw_img_data))
    elif SELECT == 19:
        I = __img__.preview_image(operations_tuple[SELECT],edge_detect.sobel_bothaxis_bitws_or_edge_detect_algo(raw_img_data))
    elif SELECT == 20:
        I = __img__.preview_image(operations_tuple[SELECT],edge_detect.sobel_bothaxis_bitws_and_edge_detect_algo(raw_img_data))
    elif SELECT == 21:
        I = __img__.preview_image(operations_tuple[SELECT],edge_detect.sobel_bothaxis_bitws_xor_edge_detect_algo(raw_img_data))
    elif SELECT == 22:
        I = __img__.preview_image(operations_tuple[SELECT],edge_detect.sobel_bothaxis_bitws_not_edge_detect_algo(raw_img_data))
    elif SELECT == 23:
        I = __img__.preview_image(operations_tuple[SELECT],edge_detect.laplacian_edge_detect_algo(raw_img_data))
    elif SELECT == 24:
        threshold_a = int(input("\n[ ? ]  Threshold A Value : "))
        threshold_b = int(input("[ ? ]  Threshold B Value : "))
        I = __img__.preview_image(operations_tuple[SELECT],edge_detect.canny_edge_detect_algo(raw_img_data,threshold_a,threshold_b))
    elif SELECT == 25:
        pass
    elif SELECT == 26:
        __img__.image_resolution(raw_img_data)
    

    __img__.export_image(I)
    msg.greet_exit()
