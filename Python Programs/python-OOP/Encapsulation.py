
# python can support encapsulation used of double underscore(__) 
# to make a variable private


class Teacher:

    def Detail(self, name, sub, dept):
        self.__name = name  # Private variable
        self.__sub = sub
        self.dept = dept

    def output(self):
        print(f"{self.__name}, {self.__sub}, {self.dept}")

T1 = Teacher()
T1.Detail("Piyush", "Python", "CSE")
# print(T1.__name)  # can't access private variable
print(T1.dept)
T1.output()