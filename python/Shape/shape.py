# -*- coding: utf-8 -*-
"""
Created on Mon Jan 25 11:56:08 2021

@author: RajatShukla
"""

class Shape:
    def __init__(self,width,height):
        self.width = width
        self.height = height
    def calculateArea(self):
        raise NotImplementedError('Calculate Error')