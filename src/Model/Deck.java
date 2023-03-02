package Model;

// import java.util.Random;
import Model.Cards.*;
import java.util.Vector;

public class Deck {
  Vector<Card> deckList;

  Deck() {
    deckList = new Vector<Card>(); /* Suppose to start by building a deck from a
                                      given file */
  }

  Deck(String Test) {
    // this is exists to trigger the testing state deck
  }

  Card dealCard() {
    // Meant for setup call
    // return a random card from the deck
    // TODO make card draw irreplacable and get random cards
    // implement shuffle() function?

    return deckList.get(0);
  }

  /**
   * @return the deckList
   */
  public Vector<Card> getDeckList() { return deckList; }

  void fillEarthDeck() {
    deckList.add(
        new TerrainCard("Prairie", "Sunny|Rocky|Cold", "!G|d1|E3|h", 3, 2));
    deckList.add(new TerrainCard("Beach", "All", "!E|4|eoa|", 7, 9));
    deckList.add(new EventCard("Tsunami", "!Y|g-5|d7", -4));
    deckList.add(new FloraCard("Japanese Maple", "Tree", "Rocky|Cold", "!Y|g1",
                               3, 4, 3, 4));
    deckList.add(new FloraCard("American Sycamore", "Tree", "All",
                               "!Y|g1|Rg-1s2", 3, 4, 3, 1));
  }

  void fillClimateDeck() {
    deckList.add(new ClimateCard("Arid", "Sunny|Rocky", "!Rd2|", 1));
  }

  void fillFuanaDeck() {
    // Score this card Fuana ability  4 flora with >=3 growth (truncks)
    deckList.add(new FuanaCard("Bald Eagle", "!F4f/3g"));
  }

  void fillIslandDeck() {
    // Ability line reads Black (on-play effect) draw 5, compost 2, and gain 7
    // soil.  Second ability: Green activated gain 2 sprouts per rocky habitat
    // flora planted this turn
    deckList.add(new IslandCard("Hawai'i", "Rocky|Cold", "!Bd5c2i7!Gs2/rp", 4));
  }
}
