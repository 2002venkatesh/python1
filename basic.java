class student:
    def __init__(self,id,name,age,dept):
        self.id=id
        self.name=name
        self.age=age
        self.dept=dept
s1=student(1001,"venkat",19,"cse")
s2=student(1002,"vimal",20,"ece")
print("id",s1.id)
print("name",s1.name)
print("age",s1.age)
print("dept",s1.dept)
print("\n")
print("id",s2.id)
print("name",s2.name)
print("age",s2.age)
print("dept",s2.dept)


OUTPUT:
id 1001
name venkat
age 19
dept cse

id 1002
name vimal
age 20
dept ece