This Java program allows the user to play a "Guess the Number" game.
The computer randomly generates a number between 1 and 100, and the user must guess the number. 
After each guess, the computer provides feedback on whether the guess is too high, too low, or correct.
The game supports multiple rounds and keeps track of the user's score. 
After each round, the user is asked if they want to continue to the next round.


Key Features of the Code:

Random Number Generation:
The program generates a random number between 1 and 100 using Random.nextInt(maxRange) + 1.

User Input:
The program uses a Scanner object to get user input.

Feedback on Guesses:
The program informs the user if their guess is too high or too low compared to the random number.

Limiting Attempts:
The user is limited to a maximum number of attempts (maxAttempts) per round.

Multiple Rounds:
The game is played over multiple rounds (totalRounds), and the score accumulates over these rounds.

Scoring System:
The score is based on the number of attempts taken to guess the correct number. Fewer attempts result in higher points.

Game Over Message:
After all rounds are completed, the program displays the final score.
