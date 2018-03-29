import matplotlib.pyplot as plt
import time
def count(S, m, n):
    table = [0 for k in range(n + 1)]
    table[0] = 1
    for i in range(0, m):
        for j in range(S[i], n + 1):
            table[j] += table[j - S[i]]
    return table[n]
val = [0 for i in range(100)]
total = []
waktu = []
for j in range(1,20001,100):
    total.append(j)
    start = time.time()
    x = count(val,len(val),j)
    end = time.time()
    waktu.append(end - start)
plt.ylabel("time")
plt.xlabel("banyak uang")
plt.plot(total,waktu)
plt.show()

