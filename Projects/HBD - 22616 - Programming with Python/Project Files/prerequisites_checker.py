import greetings_msg as msg

print("[ \u25B2 ]  Checking Prerequisites......\n")



print("[ ! ]  Trying to import \"Numpy\".....")
try:
    import numpy as npy                     
except ImportError as NUMPY_IMPORT_EXCEPTION:
    print("[ \u2717 ]  Numpy couldn't be imported.....")
    print(f"\n[ \u2717 ]  Error Message : {NUMPY_IMPORT_EXCEPTION}")
    msg.urgent_exit()

else:
    print(f"[ \u2713 ]  Numpy [ ver. {npy.version.full_version} ] --- Imported Successfully.....")



print("\n[ ! ]  Trying to import \"Open-CV\".....")
try:
    import cv2 as open_cv                     
except ImportError as OPENCV_IMPORT_EXCEPTION:
    print("[ \u2717 ]  Open-CV couldn't be imported.....")
    print(f"\n[ \u2717 ]  Error Message : {OPENCV_IMPORT_EXCEPTION}")
    msg.urgent_exit()
else:
    print(f"[ \u2713 ]  Open-CV [ ver. {open_cv.version.opencv_version} ] --- Imported Successfully.....")



print("\n\n[ \u2605 ]  All prerequisites checks are completed......")