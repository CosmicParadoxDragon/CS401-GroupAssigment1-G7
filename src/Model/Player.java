package Model;

import java.util.Vector;

import Model.Cards.Card;

public class Player {
    int compost;
    int soil;
    int gainedSoil = 0;
    int gainedCards = 0;

    Card m_islandCard, m_climateCard;

    Vector <Card> hand;
    Vector<Vector <Card>> playerTabulue;


    Player(Card islandCard, Card climateCard)
    {
        m_islandCard = islandCard;
        m_climateCard = climateCard;
    }

    void activePlanting()
    {

    }

    void inactivePlanting()
    {

    }

    void activeComposting()
    {

    }

    void inactiveComposting()
    {

    }

    void activeWatering()
    {

    }
    
    void inactiveWatering()
    {

    }

    void activeGrowing()
    {

    }

    void inactiveGrowing()
    {

    }
}
