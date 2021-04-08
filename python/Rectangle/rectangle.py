# -*- coding: utf-8 -*-
"""
Created on Mon Jan 25 11:56:50 2021

@author: RajatShukla
"""
from Shape.shape import Shape

class Rectangle(Shape):
    def calculateArea(self):
        return self.width*self.height
    