import math
RADIUS  = float(input('Radius : '))
HEIGHT  = float(input('Height : '))
SURFACE_AREA = (2 * math.pi * RADIUS) * (RADIUS + HEIGHT)
VOLUME = math.pi * (RADIUS ** 2 ) * HEIGHT
print('Surface Area of Cylinder :',SURFACE_AREA)
print('Volume of Cylinder :',VOLUME)