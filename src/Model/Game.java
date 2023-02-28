package Model;

import java.util.Vector;

import Model.Cards.Card;

class Game {

    Vector <Card> FuanaCards;
    Vector<Integer> Scores;
    Deck EarthDeck;
    
    Game()
    {
        // Game Setup Phase
        // Dealt an island
        // placeIsland()

        // Dealt a Climate
        // placeClimate()


    }

    //! Assumeing Solo Game

    // int numberOfPlayers;
    // Vector <Player> players;
    // Player firstPlayer; 
    
    void planting()
    {
        // Player Action
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