# -*- coding: utf-8 -*-
"""
Created on Fri Jan 22 17:22:09 2021

@author: RajatShukla
"""
class Shape:
    def __init__(self,width,height):
        self.width = width
        self.height = height
    def calculateArea(self):
        raise NotImplementedError('Calculate Error')
    
class Rectangle(Shape):
    def calculateArea(self):
        return self.width*self.height
    
class Triangle(Shape):
    def calculateArea(self):
        return 0.5*self.width*self.height

rectangle = Rectangle(23.4,67.9)
print(rectangle.calculateArea())

triangle = Triangle(23.4,67.9)
print(triangle.calculateArea())