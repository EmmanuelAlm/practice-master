from turtle import *
from random import randint
speed(0)
penup()
goto(-140, 140)
pendown()

for step in range(15):
    write(step, align ='center')
    right(90)
    penup()
    forward(10)
    pendown()
    forward(150)
    penup()
    backward(160)
    left(90)
    forward(20)
