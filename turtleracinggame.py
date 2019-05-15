from turtle import *
from random import randint
speed(0)
penup()
goto(-140, 140)
pendown()

for step in range(15):
    write(step, align ='center')
    right(90)
    for num in range(8):
        penup()
        forward(10)
        pendown()
        forward(10)
    penup()
    backward(160)
    left(90)
    forward(20)

ada = Turtle()
ada.color('red')
ada.shape('turtle')

ada.penup()
ada.goto(-160, 100)
ada.pendown()

emma = Turtle()
emma.color('blue')
emma.shape('turtle')

emma.penup()
emma.goto(-160, 70)
emma.pendown()

janet = Turtle()
janet.color('purple')
janet.shape('turtle')

janet.penup()
janet.goto(-160, 40)
janet.pendown()

goku = Turtle()
goku.color('black')
goku.shape('turtle')

goku.penup()
goku.goto(-160, 10)
goku.pendown()


for turn in range(1):
    ada.right(360)
    emma.right(360)
    janet.right(360)
    goku.right(360)

for turn in range(100):
    goku.forward(randint(1,5))
    ada.forward(randint(1,5))
    emma.forward(randint(1,5))
    janet.forward(randint(1,5))

