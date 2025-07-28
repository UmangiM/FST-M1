print("Welcome to the Rock-Paper-Scissors Game!")

while True:
    # Get input from both players
    player1 = input("Player 1, enter your choice (rock/paper/scissors): ").lower()
    player2 = input("Player 2, enter your choice (rock/paper/scissors): ").lower()

    # Check for a tie
    if player1 == player2:
        print("It's a tie!")

    # Player 1 chooses rock
    elif player1 == "rock":
        if player2 == "scissors":
            print("Player 1 wins! Rock beats Scissors.")
        elif player2 == "paper":
            print("Player 2 wins! Paper beats Rock.")
        else:
            print("Invalid input from Player 2.")

    # Player 1 chooses paper
    elif player1 == "paper":
        if player2 == "rock":
            print("Player 1 wins! Paper beats Rock.")
        elif player2 == "scissors":
            print("Player 2 wins! Scissors beats Paper.")
        else:
            print("Invalid input from Player 2.")

    # Player 1 chooses scissors
    elif player1 == "scissors":
        if player2 == "paper":
            print("Player 1 wins! Scissors beats Paper.")
        elif player2 == "rock":
            print("Player 2 wins! Rock beats Scissors.")
        else:
            print("Invalid input from Player 2.")

    # Invalid input from Player 1
    else:
        print("Invalid input from Player 1.")

    # Ask if they want to play again
    play_again = input("\nDo you want to play another round? (yes/no): ").lower()
    if play_again != "yes":
        print("Thanks for playing! Goodbye.")
        break

    print()  

   
