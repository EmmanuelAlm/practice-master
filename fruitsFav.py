import pygal

fruits = pygal.Pie()
fruits.title = 'Favourite Foods'

file = open('Fruits.txt', 'r')

for line in file.read().splitlines():
    if line:
        label, value = line.split(': ')
        fruits.add(label, int(value))

file.close()

fruits.render_to_file('fruits_chart1.svg')
