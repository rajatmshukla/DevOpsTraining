# -*- coding: utf-8 -*-
"""
Created on Mon Jan 25 17:13:35 2021

@author: RajatShukla
"""

import re

name = "abcd@ibm.com, xyz@ibm.com, gdhdtsvsgst@google.com"

pattern = r"[a-z\._]+@[a-z]+\.[a-z]{2,5}"

print(re.findall(pattern,name))

