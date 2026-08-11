
class Car:
    
    def __init__(self, Brand, Model):
        self.Brand = Brand
        self.Model = Model
    def show(self):
        print(self.Brand)
        print(self.Model)

obj = Car("Lamborghini", "Gallardo")  # create object of car class
# print(obj.Brand)
# print(obj.Model)
obj.show()  # calling method using object