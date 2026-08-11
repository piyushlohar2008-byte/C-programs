class Addition:
    def add(self, no1, no2):
        self.sum = no1 + no2
        print("Addition : ", self.sum)

class Substraction(Addition):
    def sub(self, no1, no2):
        super().add(18, 32)
        self.sub = no1 - no2
        print("Substraction : ", self.sub)

class Math(Substraction):
    def area(self):
        super().sub(65,45)
        print("Multilevel Inheritance")

M1 = Math()
M1.area()