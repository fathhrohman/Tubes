import time
import matplotlib.pyplot as plt
memo = {}
def fib(n):
    if n in memo : return memo[n]
    if n <= 1 : f = 1
    else : f = fib(n-1) + fib(n-2)
    memo[n] = f
    return f
x = []
jumlah = []
waktu = []
for i in range(0,100000,10):
    jumlah.append(i)
    start = time.time()
    x.append(fib(i))
    end = time.time()
    waktu.append(end-start)
plt.xlabel("nilai n")
plt.ylabel("time")
plt.plot(jumlah,waktu)
plt.show()
