# -*- coding: utf-8 -*-
"""
Created on Mon Jan 25 11:57:17 2021

@author: RajatShukla
"""
from Shape.shape import Shape

class Triangle(Shape):
    def calculateArea(self):
        return 0.5*self.width*self.height
