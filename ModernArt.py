from turtle import *
from random import randint



def randomcolour():
    colormode(255)
    red = randint(0, 255)
    blue = randint(0, 255)
    green = randint(0, 255)
    color(red, green, blue)



def randomplace():
    penup()
    x = randint(-100, 100)
    y = randint(-100, 100)
    goto(x,y)
    pendown()

def randomheading():
    heading = randint(0, 360)
    setheading(heading)

emma = shape("turtle")

for i in range(30):
    randomcolour()
    randomheading()
    randomplace()
    stamp()


clear()
setheading(0)


hideturtle()


def drawrectangle():
  randomplace()
  randomcolour()
  hideturtle()
  length = randint(10, 100)
  height = randint(10, 100)
  begin_fill()
  forward(length)
  right(90)
  forward(height)
  right(90)
  forward(length)
  right(90)
  forward(height)
  right(90)
  end_fill()



for i in range(20):
  speed(0)
  drawrectangle()

clear()
setheading(0)


def drawcircle():
  dot(randint(35, 75))
  randomcolour()
  randomplace()

for i in range(30):
  drawcircle()


clear()
setheading(0)


def drawstar():
  begin_fill()
  for side in range(5):
    left(144)
    forward(50)
    end_fill()

for i in range(10):
  drawstar()

