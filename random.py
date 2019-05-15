def print_something(name,age):
    print("My name is " + name + " and my age is " + str(age))

#print_something("emma",17)


def print_people(*people):
    for person in people:
        print("This person is ", person)

#print_people("Nick", "Sam", "Apple", "Dan")

def do_math(num1, num2):
    return num1 + num2

math1 = do_math(5,7)
math2 = do_math(11, 34)

print("First sum is ", math1, " and the second sum is ", math2)