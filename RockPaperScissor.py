

player1 = input('rock(q), paper (w) or scissor (e)?')
player2 = input('rock(1), paper(2) or scissor (3)')
if player1 == 'q':
    print('0 vs', end=' ')
elif player1 == 'w':
    print('___ vs', end=' ')
else:
    print('>8 vs', end=' ')


if player2 == '1':
    print('0')
elif player2 == '2':
    print('___')
else:
    print('>8')


#print(chosen)



#print(computer)

if player1 == player2:
    print('DRAW!')
elif player1 == 'q' and player2 == '3':
    print('Player1 Wins!')
elif player1 == 'q' and player2 == '2':
    print('Player2 Wins')
elif player1 == 'w' and player2 == '1':
    print('Player1 Wins!')
elif player1 == 'w' and player2 == '3':
    print('Player2 Wins!')
elif player1 == 'e' and player2 == '1':
    print('Player2 Wins!')
elif player1 == 'e' and player2 == '2':
    print('Player1 Wins')
