class Employee:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def show(self):
        print(f"Name : {self.name} Age : {self.age}")

obj = Employee("Piyush", 18)
obj.show()