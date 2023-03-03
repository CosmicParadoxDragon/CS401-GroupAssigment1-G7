package Model;

import java.util.Scanner;
import Model.Board.Tableau;
import java.util.Vector;
import Model.Cards.Card;

public class Player {
    String playerName = "John Smith";
    Tableau m_tableau = new Tableau();
    int soil;
    int gainedSoil = 0;
    int gainedCards = 0;
    Card m_islandCard, m_climateCard;
    Vector <Card> hand;
    Vector <Card> compostPile;
    Vector<Vector <Card>> playerTabulue;
    Game m_game;
    public String getName()
    {
        return playerName;
    }
    Player(Game currentGame)
    {
        hand = new Vector<Card>();
        compostPile = new Vector<Card>();
        m_game = currentGame;

        playerTabulue = new Vector<Vector <Card>>();
    }
    public Vector <Card> getHand()
    {
        return hand;
    }
    void setIsland(Card islandCard)
    {
        m_islandCard = islandCard;
    }
    void setClimate(Card cliamteCard)
    {
        m_climateCard = cliamteCard;
    }
    
    String takeTurn()
    {
        String actionChosen = "";

        //Choose an action
        // Switch to correct branch
        actionChosen = selectAction();

        switch (actionChosen)
        {
            case "planting":
                activePlanting(); break;
            case "composting":
                activeComposting(); break;
            case "growing":
                activeGrowing(); break;
            case "watering":
                activeWatering(); break;
        }

        return actionChosen;
    }
    
    String selectAction()
    {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter number from 1 to 4 for each action " +
                 "\n 1: Planting" +
                 "\n 2: Composting" +
                 "\n 3: Growing" +
                 "\n 4: Watering");
         int selection = scanner.nextInt();
        switch (selection) {
            case 1 -> {
                return "planting";
            }
            case 2 -> {
                return "composting";
            }
            case 3 -> {
                return "growing";
            }
            case 4 -> {
                return "watering";
            }
            default -> System.out.print("Please enter number from 1-4 !!!");
        }
        return "";
    }

    void activePlanting()
    {

        Scanner scanner = new Scanner(System.in);
        // Active Player Action
        // How to
        // Plant 2 Cards
        // Probably print all current Earth Card that is in your hand

        // Chose an Earth card index in your hand to place it onto the tableau
        Card selected_card = hand.get(scanner.nextInt());

        // Get the position for card planting and place it onto your tableau
        {
            System.out.print("Enter the position of the card in the tableau: ");
            int horizontal_pos = scanner.nextInt();
            int vertical_pos = scanner.nextInt();
            m_tableau.setCard(horizontal_pos, vertical_pos, selected_card);
        }


        // Draw 4 Discard 3 (not compost)
        for (int i = 0; i < 4; i++)
            hand.add(m_game.EarthDeck.dealCard());
        // Compost 3 cards
        discard(3);
    }

    void active_plating_ability() {
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                // Fetching color from abilities
                //if(m_tableau.getCardFromTableau(i,j).getM_abilities().contains("GREEN"))
                //  activate the ability
            }
        }
    }
    void discard(int numberToDiscard)
    {
        for ( int i = 0; i < numberToDiscard; i++)
        {
            
        }
    }
    void inactivePlanting()
    {
        // Gaia Action
        // discarded cards become compost


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

    Tableau getTableau () {
        return m_tableau;
    }
}
