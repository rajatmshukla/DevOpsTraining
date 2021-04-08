# -*- coding: utf-8 -*-
"""
Created on Mon Jan 25 11:58:04 2021

@author: RajatShukla
"""
from Rectangle.rectangle import Rectangle
from Triangle.triangle import Triangle

print("Area of Rect and Tri respectively:")
rectangle = Rectangle(23.4,67.9)
print(rectangle.calculateArea())

triangle = Triangle(23.4,67.9)
print(triangle.calculateArea())