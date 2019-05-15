from random import randint


player= input('Fire(f), Logs(l), Water(w) ?')



if player =='f':
    print('VVV vs', end=' ')
elif player == 'l':
    print('==== vs', end=' ')
else:
    print('wwww vs', end=' ')




chosen = randint(1,3)



if chosen == 1:
    computer = 'f'
    print('VVV')
elif chosen == 2:
    computer = 'l'
    print('====')
elif chosen ==3:
    computer = 'w'
    print('wwww')


if player == computer:
    print('Draw')
elif player == 'f' and computer == 'l':
    print('Player Wins!')
elif player == 'w' and computer == 'f':
    print('Player Wins!')
elif player == 'l' and computer == 'w':
    print('Player Wins!')
elif player == 'l' and computer == 'f':
    print('Player Loses')
elif player == 'f' and computer == 'w':
    print('Player Loses')
elif player == 'l' and computer == 'w':
    print('Player loses')
