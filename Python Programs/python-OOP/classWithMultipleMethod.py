
class Student:

    def getdata(self, Name, Branch, rollno):
        self.Name = Name
        self.Branch = Branch
        self.rollno = rollno
    
    def Showdata(self):
        print(f"{self.Name} {self.Branch} {self.rollno}")

s1 = Student()
s1.getdata("Piyush", "CSE", 33)
s1.Showdata()