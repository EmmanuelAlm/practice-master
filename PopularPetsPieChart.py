import pygal

piechart2 = pygal.Pie()

file = open('pets.txt', 'r')
for line in file.read().splitlines():
    if line:
        label, value = line.split(' ')
        piechart2.add(label, int(value))

file.close()

piechart2.render_to_file('Pet_chart2.svg')




bar_chart = pygal.Bar()
bar_chart.title = ('What is your favourite sport?')
bar_chart.add('Soccer', 10)
bar_chart.add('Baseball', 12)
bar_chart.add('Football', 6)
bar_chart.add('Tennis', 3)
bar_chart.add('Basketball', 7)
bar_chart.render_to_file('bar_chart.svg')
