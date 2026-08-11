
# import time

class Person:

    def get_Info(self, name, number, age):
        self.name = name
        self.number = number
        self.age = age
    
    def display(self):
        print(f"{self.name}, {self.number}, {self.age}")

    def About_Study(self, certificates, languages, degree):
        self.certificates = certificates
        self.languages = languages
        self.degree = degree

        print(f"{self.certificates}, {self.languages}, {self.degree}")

class Employee(Person):

    def Information(self, dept):
        self.dept = dept

    def show_detail(self):
        print(self.dept)


obj1 = Employee()
obj1.get_Info("Pawan", 9647891645, 27)
obj1.display()
# time.sleep(2)
obj1.About_Study("MS-CIT", "Python", "M.Tech")
# time.sleep(2)
obj1.Information("Computer science")
obj1.show_detail()