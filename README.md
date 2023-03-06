# CS401-GroupAssignment1-G7

---

First group assignment for the CS401 Class, Spring 2023 semester at CSUEB.

Game Setup
---
### Game
- Score Keeping
- Turn Clock
- Solo Mode
  > Simultaneous turns mean we can't do a hotseat multiplayer, and online is not worth including in a project of this scale.
- Win Conditions
    > Track fuana cards, probably can evaluate at the end of the game.
  
### Players
- Player Board
  - Player Island/Tableau
    > This is the 4x4 grid of cards that the player builds up over the course of the game.  Called both the Island and Tableau interchangealbly.    
  - ~Leaf Token Track~
    > ~Leaf tokens track which objective has been scored on. More relevant in multiplayer games, but the order is important because the first player or non-player who scores them achives more points.~
  - Compost Pile
    > Cards that have been discarded here are face down no longer matter.
  - Hand
  > This is a vector containing the Cards currently in the hand of the Player.
  - Soil Bank
    > This an int, as the player board is partailly repersented by the Player class, although it contains other functions for game logic, and is both the player board and the user's repersentation in the game.
    > Cards that cost soil to play need to make a check here that they player can afford to play them
- Island Zone
    > The Island zone has one island card assigned before turn 1
- Cliamte Zone
    > The this is a card zone for one card assignment made before turn 1
- Enviroment Zone
    > A wincondition card that maybe implemented.
  
### Cards
- Earth Cards
  - Flora Cards
    > Animal themed cards played with for the course of the whole game
  - Event Cards
   > Events that create persistent negative and positive effects for the player 
  - Terrain Cards
  > Played thoughout the game into the Island

- Fuana Cards
  > These are pre-game cards that determine the victory conditions for the player
- Island Card
    > This is a card assigned at the beginning of the game and does not change after 
- Climate Cards
  > This is also a post-turn 1 static card
- Enviroment Cards
  > This is a post turn 1 static card, that doesn't interact besides informing the player an additional objective

    > The Game can be played without these cards so they will not be implemented until the other functionality exists.
- Abilities
  - Immeadiate Action
    > 'Black' bordered abilities in the images, these resolve when the card is played
  - Ongoing/Win Condition
    > This is a temporary term as a placeholder for abilities that are checked on an ongoing basis, primarily win condition abiliites that score you points. There will be a toggle on the card to stop the check once scored.
  - Triggered
    > These abilities are color coded and active after that action is taken in game.  Abilities with mutliple colors exist.  Abilities are activated at the end on each players the action on their turn.
  - Encoding Abilities
    > Need some way to encode abilities into patterns of characters so that we can use alphanumeric strings to build cards instead of hard coding them.
  - Need a csv file and accessors for the cards in normalized format
  

## Members
Sohrab Kazak

Truong Dinh

Jed Faalam
