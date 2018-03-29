class emosi:
    def __init__(self,em):
        self.em = em
        self.rendah = 0
        self.sedang = 0
        self.tinggi = 0
        self.min = 1
        self.max = 0
    def nilai_rendah(self):
        if (self.em <= 40 and self.em >= 0):
            self.rendah = 1
        elif (self.em > 40 and self.em < 50):
            self.rendah = (-1 *(self.em - 50))/10
    def nilai_sedang(self):
        if (self.em <= 70 and self.em >= 50):
            self.sedang = 1
        elif (self.em > 40 and self.em < 50):
            self.sedang = (self.em - 40)/10
        elif (self.em >70 and self.em < 80):
            self.sedang = (-(self.em - 80))/10
    def nilai_tinggi(self):
        if (self.em >= 80 and self.em <=100):
            self.tinggi = 1
        elif (self.em >70 and self.em < 80):
            self.tinggi = (self.em - 70)/10
    def minmax(self):
        a = [self.rendah,self.sedang,self.tinggi]
        for i in a :
            if (i > self.max):
                self.max = i
            elif ( 0 < i < self.min):
                self.min = i;

class provokasi():
    def __init__(self,pro):
        self.pro = pro
        self.sangatrendah = 0
        self.rendah = 0
        self.sedang = 0
        self.tinggi = 0
        self.min = 1
        self.max = 0
    def nilai_sangatrendah(self):
        if (self.pro <= 15 and self.pro >=0):
            self.sangatrendah = 1
        elif (15 < self.pro < 25):
            self.sangatrendah = (-1 * (self.pro - 25))/10
    def nilai_rendah(self):
        if (self.pro <= 40 and self.pro >= 25):
            self.rendah = 1
        elif (self.pro > 40 and self.pro < 50):
            self.rendah = (-1 *(self.pro - 50))/10
        elif (15 < self.pro < 25):
            self.rendah = (self.pro - 15)/10
    def nilai_sedang(self):
        if (self.pro <= 70 and self.pro >= 50):
            self.sedang = 1
        elif (self.pro > 40 and self.pro < 50):
            self.sedang = (self.pro - 40)/10
        elif (self.pro >70 and self.pro < 80):
            self.sedang = (-(self.pro - 80))/10
    def nilai_tinggi(self):
        if (self.pro >= 80 and self.pro <=100):
            self.tinggi = 1
        elif (self.pro >70 and self.pro < 80):
            self.tinggi = (self.pro - 70)/10
    def minmax(self):
        a = [self.rendah,self.sedang,self.tinggi]
        for i in a :
            if (i > self.max):
                self.max = i
            elif ( 0 < i < self.min):
                self.min = i;
e = [97,36,63,82,71,79,55,57,40,57,77,68,60,82,40,80,60,50,100,11,58,68,64,57,77,98,91,50,95,27]
p = [74,85,43,90,25,81,62,45,65,45,70,75,70,90,85,68,72,95,18,99,63,70,66,77,55,64,59,95,55,79]

z = 0
while z < 30 :
    hoax = 0
    tidak = 0
    x = emosi(e[z])
    y= provokasi(p[z])
    x.nilai_tinggi()
    x.nilai_sedang()
    x.nilai_rendah()
    y.nilai_sangatrendah()
    y.nilai_tinggi()
    y.nilai_sedang()
    y.nilai_rendah()
    x.minmax()
    y.minmax()
    temp_n = []
    temp_j = []

    if (x.tinggi== 1 or x.sedang == 1 or x.rendah == 1 ) and (y.tinggi == 1 or y.sedang == 1 or y.rendah == 1 or y.sangatrendah == 1):
        if (x.rendah == 1 and y .sangatrendah == 1):
            tidak = 1
        elif (x.rendah == 1 and y.rendah == 1):
            tidak = 1
        elif (x.rendah == 1 and y.sedang == 1):
            tidak = 1
        elif (x.rendah == 1 and y.tinggi == 1):
            hoax = 1
        elif (x.sedang == 1 and y.sangatrendah == 1):
            tidak = 1
        elif (x.sedang == 1 and y.rendah == 1):
            tidak = 1
        elif (x.sedang == 1 and y.sedang == 1):
            tidak = 1
        elif (x.sedang == 1 and y.tinggi == 1):
            hoax = 1
        elif (x.tinggi == 1 and y.sangatrendah == 1):
            tidak = 1
        elif (x.tinggi == 1 and y.rendah == 1):
            hoax = 1
        elif (x.tinggi == 1 and y.sedang == 1):
            hoax = 1
        elif (x.tinggi == 1 and y.tinggi == 1):
            hoax = 1
    elif (x.tinggi== 1 or x.sedang == 1 or x.rendah == 1):
        if (x.rendah == 1):
            if (0 < y.sangatrendah < 1):
                temp_n.append(y.sangatrendah)
                temp_j.append("tidak")
            if (0 < y.rendah < 1):
                temp_n.append(y.rendah)
                temp_j.append("tidak")
            if (0 < y.sedang < 1):
                temp_n.append(y.sedang)
                temp_j.append("tidak")
            if (0 < y.tinggi < 1):
                temp_n.append(y.tinggi)
                temp_j.append("hoax")
        elif (x.sedang == 1):
            if (0 < y.sangatrendah < 1):
                temp_n.append(y.sangatrendah)
                temp_j.append("tidak")
            if (0 < y.rendah < 1):
                temp_n.append(y.rendah)
                temp_j.append("tidak")
            if (0 < y.sedang < 1):
                temp_n.append(y.sedang)
                temp_j.append("tidak")
            if (0 < y.tinggi < 1):
                temp_n.append(y.tinggi)
                temp_j.append("hoax")
        elif (x.tinggi == 1):
            if (0 < y.sangatrendah < 1):
                temp_n.append(y.sangatrendah)
                temp_j.append("tidak")
            if (0 < y.rendah < 1):
                temp_n.append(y.rendah)
                temp_j.append("hoax")
            if (0 < y.sedang < 1):
                temp_n.append(y.sedang)
                temp_j.append("hoax")
            if (0 < y.tinggi < 1):
                temp_n.append(y.tinggi)
                temp_j.append("hoax")
    elif (y.tinggi == 1 or y.sedang == 1 or y.rendah == 1 or y.sangatrendah == 1):
        if (y.sangatrendah == 1):
            if (0 < x.rendah < 1):
                temp_n.append(x.rendah)
                temp_j.append("tidak")
            if (0 < x.sedang < 1):
                temp_n.append(x.sedang)
                temp_j.append("tidak")
            if (0 < x.tinggi < 1):
                temp_n.append(x.tinggi)
                temp_j.append("tidak")
        if (y.rendah == 1):
            if (0 < x.rendah < 1):
                temp_n.append(x.rendah)
                temp_j.append("tidak")
            if (0 < x.sedang < 1):
                temp_n.append(x.sedang)
                temp_j.append("tidak")
            if (0 < x.tinggi < 1):
                temp_n.append(x.tinggi)
                temp_j.append("hoax")
        elif (y.sedang == 1):
            if (0 < x.rendah < 1):
                temp_n.append(x.rendah)
                temp_j.append("tidak")
            if (0 < x.sedang < 1):
                temp_n.append(x.sedang)
                temp_j.append("tidak")
            if (0 < x.tinggi < 1):
                temp_n.append(x.tinggi)
                temp_j.append("hoax")
        elif (y.tinggi == 1):
            if (0 < x.rendah < 1):
                temp_n.append(x.rendah)
                temp_j.append("hoax")
            if (0 < x.sedang < 1):
                temp_n.append(x.sedang)
                temp_j.append("hoax")
            if (0 < x.tinggi < 1):
                temp_n.append(x.tinggi)
                temp_j.append("hoax")
    else :
        if (0 < x.rendah < 1):
            if (0 < y.sangatrendah < 1):
                if (x.rendah < y.sangatrendah):
                    temp_n.append(x.rendah)
                else :
                    temp_n.append(y.sangatrendah)
                temp_j.append("tidak")
            if (0 < y.rendah < 1):
                if (x.rendah < y.rendah):
                    temp_n.append(x.rendah)
                else :
                    temp_n.append(y.rendah)
                temp_j.append("tidak")
            if (0 < y.sedang < 1):
                if (x.rendah < y.sedang):
                    temp_n.append(x.rendah)
                else :
                    temp_n.append(y.sedang)
                temp_j.append("tidak")
            if (0 < y.tinggi < 1):
                if (x.rendah < y.tinggi):
                    temp_n.append(x.rendah)
                else :
                    temp_n.append(y.tinggi)
                temp_j.append("hoax")
        if (0 < x.sedang < 1) :
            if (0 < y.sangatrendah < 1):
                if (x.sedang < y.sangatrendah):
                    temp_n.append(x.sedang)
                else :
                    temp_n.append(y.sangatrendah)
                temp_j.append("tidak")
            if (0 < y.rendah < 1):
                temp_j.append("tidak")
                if (x.sedang < y.rendah):
                    temp_n.append(x.sedang)
                else :
                    temp_n.append(y.rendah)
            if (0 < y.sedang < 1):
                temp_j.append("tidak")
                if (x.sedang < y.sedang):
                    temp_n.append(x.sedang)
                else :
                    temp_n.append(y.sedang)
            if (0 < y.tinggi < 1):
                temp_j.append("hoax")
                if (x.sedang < y.tinggi):
                    temp_n.append(x.sedang)
                else :
                    temp_n.append(y.tinggi)
        if (0 < x.tinggi < 1):
            if (0 < y.sangatrendah < 1):
                temp_j.append("tidak")
                if (x.tinggi < y.sangatrendah):
                    temp_n.append(x.tinggi)
                else :
                    temp_n.append(y.sangatrendah)
            if (0 < y.rendah < 1):
                temp_j.append("hoax")
                if (x.tinggi < y.rendah):
                    temp_n.append(x.tinggi)
                else :
                    temp_n.append(y.rendah)
            if (0 < y.sedang < 1):
                temp_j.append("hoax")
                if (x.tinggi < y.sedang):
                    temp_n.append(x.tinggi)
                else :
                    temp_n.append(y.sedang)
            if (0 < y.tinggi < 1):
                temp_j.append("hoax")
                if (x.tinggi < y.tinggi):
                    temp_n.append(x.tinggi)
                else :
                    temp_n.append(y.tinggi)

    a = 0
    temp_tidak = []
    temp_hoax = []
    for i in temp_j :
        if (i == "tidak"):
            temp_tidak.append(temp_n[a])
        if (i == "hoax"):
            temp_hoax.append(temp_n[a])
        a = a + 1

    if (len(temp_hoax)> 1):
        for i in temp_hoax :
            if (i > hoax) :
                hoax = i
    elif (len(temp_hoax) == 1):
        hoax = temp_hoax[0]
    if (len(temp_tidak)>1):
        for i in temp_tidak :
            if (i > tidak):
                tidak = i
    elif (len(temp_tidak) ==1 ):
        tidak = temp_tidak[0]
    sugeno = ((tidak * 5)+(hoax * 10)) / (tidak + hoax)
    print (z+1,".sugeno = ",sugeno)
    if (2.5 <= sugeno < 7.5):
        print (z+1,".hasil = tidak")
    elif (7.5 <= sugeno < 12.5):
        print (z+1,".hasil = ya")
    z = z+1
    print("")
