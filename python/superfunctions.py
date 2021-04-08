# -*- coding: utf-8 -*-
"""
Created on Fri Jan 22 17:43:08 2021

@author: RajatShukla
"""

class One:
    def sendMsg(self):
        print('Send msg1 executed')

class Two(One):
    def sendMsg(self):
        print('Send msg2')
        
two = Two()
two.sendMsg()