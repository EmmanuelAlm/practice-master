from turtle import *

screen = Screen()
screen.setup(400,400)
colours = {
  'black':'#000000',
  'red':'#F41A1A',
  'purple':'#9346E1',
  'verylime':'#A7E30E',
  'reallyrasberry':'#FA057F'
}
palette = {
  'gold':'#F5C413',
  'orange':'#E89120',
  'brown':'#BF4B0D'
}


screen.bgcolor(colours['verylime'])


hideturtle()
penup()
goto(0,-175)
pendown()
right(100)
left(100)
circle(-175)
dot(-375, 'purple')



print(colours['verylime'])
print(colours['reallyrasberry']




penup()
goto(0,100)
color(colours['red'])
style = ('Arial', 40, 'bold')
write('Hello', font = style, align='center')
right(90)
forward(60)
color(colours['verylime'])
write('World', font = style, align='center')
goto(0, -10)
color(colours['reallyrasberry'])
write('Emma', font = style, align='center')
hideturtle()

