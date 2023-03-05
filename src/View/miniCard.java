package View;


import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.*;

public class miniCard {
    static int cardColSize = 17;
    static int cardRowSize = 7;
    Panel outerPanel = new Panel();
    Panel Card = new Panel();

    public miniCard(){
        outerPanel.setLayoutManager(new BorderLayout());
        Card.addComponent(new Label("borp"));
        Card.addComponent(new Label("borp2"));
        Card.addComponent(new Button("  View Card  "));
        outerPanel.addComponent(Card.withBorder(Borders.singleLine("Card Name")));
        outerPanel.setSize(new TerminalSize(cardColSize, cardRowSize));
    }

    Panel getPanel(){
        return outerPanel;
    }

    void setCardPosition(int colPos, int rowPos){

        outerPanel.setPosition(new TerminalPosition(colPos,rowPos));

    }

    static int getCardColSize(){
        return cardColSize;
    }

    static int getCardRowSize(){
        return cardRowSize;
    }
}
