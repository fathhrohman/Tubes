import math
import random

def fungsi(x1,x2):
    return ((4 - (2.1*x1**2) + (x1**4/3))*x1**2 ) + (x1*x2) + ((-4 + (4*x2**2))*x2**2 )

t_awal = 40
t_akhir = 0.0001
x1 = random.uniform(-10, 10)
x2 = random.uniform(-10,10)
cost = fungsi(x1,x2)
for n in range(0,30000):
    x3 = random.uniform(-10,10)
    x4 = random.uniform(-10,10)
    temp = fungsi(x3,x4)

    if temp < cost :
        cost = temp
    else :
        delta = temp - cost
        exp = math.exp(-1 * delta / t_awal)
        if  exp > random.uniform(0,10) :
            cost = temp
            x1 = x3
            x2 = x4
    if t_awal > t_akhir :
        t_awal = 0.85 * t_awal
    else :
        t_awal = t_akhir


print(cost)