from random import randint

player = input('rock(r), paper (p) or scissor (s)?')
if player == 'r':
    print('0 vs', end=' ')
elif player == 'p':
    print('____ vs', end=' ')
else:
    print('>8 vs', end=' ')



chosen = randint(1,3)
#print(chosen)

if chosen ==1:
    computer = 'r'
    print('0')
elif chosen ==2:
    computer = 'p'
    print('____')
else:
    computer = 's'
    print('>8')

#print(computer)

if player == computer:
    print('DRAW!')
elif player == 'r' and computer == 's':
    print('Player Wins!')
elif player == 'r' and computer == 'p':
    print('Computer Wins')
elif player == 'p' and computer == 'r':
    print('Player Wins!')
elif player == 'p' and computer == 's':
    print('Computer Wins!')
elif player == 's' and computer == 'r':
    print('Computer Wins!')
elif player == 's' and computer == 'p':
    print('Player Wins')
