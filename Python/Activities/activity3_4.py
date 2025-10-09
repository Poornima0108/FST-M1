while True:
    player1_choice = input("Enter player1 choice:rock, paper or scissors:").lower()
    player2_choice = input("Enter player2 choice:rock, paper or scissors:").lower()

    if player1_choice == player2_choice:
        print("Game is tie")
    elif player1_choice == "rock":
        if player2_choice == "scissors":
            print("Player 1 wins")
        else:
            print("Player 2 wins")
    elif player1_choice == "scissors":
        if player2_choice == "paper":
            print("Player 1 wins")
        else:
            print("Player 2 wins")
    elif player1_choice == "paper":
        if player2_choice == "rock":
            print("Player 1 wins")
        else:
            print("Player 2 wins")                    

    play_again = input("Play again?").lower()
    if play_again == "y" or play_again == "yes":
        pass
    else:
        break