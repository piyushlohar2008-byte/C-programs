class Math:
    def add(self, a = 0, b = 0, c = 0):
        print(a + b + c)

m = Math()
m.add(1, 2)
m.add(1, 3, 5)

class Math2:
    def add2(self, *args):
        print(sum(args))

m2 = Math2()
m2.add2(2, 4, 6)
m2.add2(2, 4, 6, 8, 10)