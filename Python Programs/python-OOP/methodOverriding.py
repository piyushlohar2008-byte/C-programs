class Animal:
    def action(self, name):
        self.name = name
        print(name, "makes noise")

class Dog(Animal):
    def action(self, name):
        super().action(name)
        print(name, "makes sound")

D1 = Dog()
D1.action("Puppy")