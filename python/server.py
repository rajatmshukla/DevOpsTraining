# -*- coding: utf-8 -*-
"""
Created on Mon Jan 25 17:26:36 2021

@author: RajatShukla
"""

import socket

HOST = "127.0.0.1"

PORT = 4001

server = socket.socket(socket.AF_INET,socket.SOCK_STREAM)

server.bind((HOST,PORT))
server.listen(2)

while True:
    clientsocket,address = server.accept()  
    print(f"connected to client on {address}")
    clientsocket.send("This is a test msg from the server".encode("UTF-8"))
    
server.shutdown()
server.close()