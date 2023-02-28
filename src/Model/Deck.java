package Model;

import java.util.Vector;

import Model.Cards.*;

public class Deck {
    Vector <Card> deckList;
            
    Deck() { /* Suppose to start by building a deck from a given file */ }

    Deck(String Test)
    {
        // this is exists to trigger the testing state deck 

        fillDeck();

    }

    void fillDeck()
    {
        deckList.add(new TerrainCard("Prairie", "Sunny|Rocky|Cold", "!G|d1|E3|h", 3, 2));
        deckList.add(new TerrainCard("Beach", "All", "!E|4|eoa|", 7, 9));
        deckList.add(new EventCard("Tsunami", "!Y|g-5|d7", -4));
        deckList.add(new FloraCard("Japanese Maple", "Tree", "Rocky|Cold", "!Y|g1", 3, 4, 3, 4));
        deckList.add(new FloraCard("American Sycamore", "Tree", "All", "!Y|g1|Rg-1s2", 3, 4, 3, 1));
    }

}
