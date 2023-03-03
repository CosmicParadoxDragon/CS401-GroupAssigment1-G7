package Model;

import java.util.Vector;

import Model.Cards.*;
import Model.Board.Tableau;
class Game {

    int m_numberOfPlayers;
    Vector <Card> FuanaCards;
    Vector<Integer> Scores;
    Vector <Player> players;
    Deck EarthDeck;
    Deck IslandDeck;
    Deck ClimateDeck;
    Deck FuanaDeck;
    Deck discardPile;

    Player activePlayer;

    Game(int numberOfPlayers)
    {   
        EarthDeck = new Deck();
        IslandDeck = new Deck();
        ClimateDeck = new Deck();
        FuanaDeck = new Deck();
        discardPile = new Deck();
        FuanaCards = new Vector<Card>();
        Scores = new Vector<Integer>();
        players = new Vector<Player>();
        m_numberOfPlayers = numberOfPlayers;
        // Game Setup Phase
        SetupPhase();
        mainTurnLoop();
        activePlayer = players.get(0);

    }
    
    //! Assuming Solo Game
    private void SetupPhase()
    {
        EarthDeck.fillEarthDeck();
        ClimateDeck.fillClimateDeck();
        FuanaDeck.fillFuanaDeck();
        IslandDeck.fillIslandDeck();
        for (int i = 0; i < m_numberOfPlayers; i++)
        {
            players.add(new Player(this));
        }

        for (int j = 0; j<4; j++)
        {
            FuanaCards.add(FuanaDeck.dealCard());

        }
        // 1 Player game is standard expect everything to break
        for (int i = 0; i < m_numberOfPlayers; i++)
        {
            Card island = IslandDeck.dealCard();
            players.get(i).getHand().add(island);
            // Activate the island immediate ability with black background
            // E.g: island.parseAbility("black");
            island.parseAbilities(island.getM_abilities()) ;
            // This should work if parseAbility is complete
            players.get(i).getHand().add(ClimateDeck.dealCard());
            //players.get(i).getHand().add(EarthDeck.dealCard());
            // players.get(i).getHand().add(EcosystemDeck.dealCard()); // if we ever get here
        }
    }
    boolean assertPlayerTurn() {
        boolean takeSameTurn;
        for (int i = 0; i < m_numberOfPlayers - 1; i++) {
            if (players.elementAt(i) == players.elementAt(i+1)) {
                takeSameTurn = true;
            }
        }
        return false;
    }
    void mainTurnLoop()
    {
        int no_of_turn = 0;
        boolean TableauDeckisFilled = false;
        // End game condition
        // If a player tableau is filled and everyone has taken the same no_of_turn
        // The game is completed
        while (!TableauDeckisFilled) {
            for (Player currentPlayer : players) {
                // Checking if the tableau is filled
                if (currentPlayer.getTableau().isBoardFilled()) {
                    TableauDeckisFilled = true;
                }
                System.out.printf("Now it is player %s turn. \n", currentPlayer.getName());
                currentPlayer.takeTurn();

                // Can calculate the player point in here
            }
            no_of_turn = 0;
        }
    }

    Vector<Card> getFuanaCards()
    {
        return FuanaCards;
    }

    Vector<Player> getPlayers()
    {
        return players;
    }

    void planting()
    {
        // Active Player Action
        // Plant 2 Cards
        // Draw 4 Discard 3 (not compost)
        
        // Gaia Action
        // Your Discards move to compost

        // Trigger Green Abilities
    }

    void compostion()
    {
        // Player Action
        // Gain 5 Soil
        // Compost 2 Cards from the EarthDeck

        // Gaia Action
        // Compost 2 cards, Compost 1 for every 2 soil gained this turn

        // Trugger Red and Multicolored Abilities
    }

    void watering()
    {
        //Player Action
        // Gain 6 sprouts
        // May gain 2 soul

        // Gaia Action
        // you gain 1 sprout per red ability you have

        // Trigger all blue and multicolored abilities
    }
    
    void growing()
    {
        // Player Action
        // Draw 4 to hand
        // Place 2 growth

        // Gaia Action
        // gain 1 growth for each draw this turn

        // Trigger Yellow and Multicolored Abilities
    }
}