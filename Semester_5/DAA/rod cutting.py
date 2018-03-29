import random
import time
import matplotlib.pyplot as plt
def cutRod(price, n):
    val = [0 for x in range(n + 1)]
    val[0] = 0

    for i in range(1, n + 1):
        max_val = 0
        for j in range(i):
            max_val = max(max_val, price[j] + val[i - j - 1])
        val[i] = max_val

    return val[n]
val = [1]
n = []
p = []
for i in range (1,1000):
    val.append(random.randint(val[i-1],val[i-1]+5))
    start = time.time()
    x = cutRod(val,len(val))
    end = time.time()
    n.append(end - start)
    p.append(i)
plt.ylabel("time")
plt.xlabel("Panjang kayu")
plt.plot(p,n)
plt.show()