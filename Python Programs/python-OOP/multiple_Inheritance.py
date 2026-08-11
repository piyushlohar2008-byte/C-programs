class Sum:
    def getData(self, no):
        self.sum = 0
        for i in range(1, no+1):
            self.sum += i

    def showData(self):
        print("Sum of natural no : ", self.sum)

class Fact:
    def getDetails(self, no):
        self.fact = 1
        for i in range(1, no+1):
            self.fact *= i

    def display(self):
        print("Factorial : ", self.fact)

class Area(Sum, Fact):
    def output(self):

        print("Multiple inheritance")

A = Area()
A.getData(10)
A.getDetails(5)
A.showData()
A.display()