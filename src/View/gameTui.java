package View;

import Model.Cards.Card;
import Model.Game;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.gui2.*;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;
import java.util.Arrays;
import java.util.Vector;

import static com.googlecode.lanterna.gui2.Window.Hint.FULL_SCREEN;

public class gameTui {

    Terminal terminal;
    Screen screen;
    TextGraphics tGraphics;
    MultiWindowTextGUI gameWindows;
    GridLayout gameLayout;
    Panel gameGrid;
    gameWindow mainGameWindow;
    Game game;

    int tColSize = 132;
    int tRowSize = 43;
    Vector<Card> hand;


    public gameTui(Game game) throws IOException {
        this.game = game;

        //Initialize TUI layers
        terminal = new DefaultTerminalFactory().setInitialTerminalSize(new TerminalSize(tColSize, tRowSize)).createTerminal();
        //screen size is hardcoded. The more dynamic layout managers make it difficult to ensure that
        //each element is in the correct location. I don't see this as a big issue, but it could potentially be changed
        //later with some effort if needed.
        screen = new TerminalScreen(terminal);
        screen.startScreen();
        gameWindows = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.BLUE));
        mainGameWindow = new gameWindow();
        mainGameWindow.setHints(Arrays.asList(FULL_SCREEN));
        //Creates fullscreen panel for main game UI

        gameGrid = new Panel(new AbsoluteLayout());
        //creates a grid that allows elements to be placed at specific locations

        hand = game.getActivePlayer().getHand();

        refreshScreen();
        //initial draw

    }

    private class gameWindow extends BasicWindow{
        public gameWindow(){
            super("Game Title");
        }
    }
    public void refreshScreen(){
        drawGrid();
        drawHand();

        mainGameWindow.setComponent(gameGrid);
        gameWindows.addWindowAndWait(mainGameWindow);


    }

    private void drawGrid(){
        drawCardSlots(25,2,4,4);
    }

    private void drawHand(){
        drawCardSlots(1,tRowSize - miniCard.getCardRowSize() -1,7,1);
    }
    private void drawCardSlots(int startCol, int startRow, int cols,int rows){

        int cardIndex = 0;
        //used to iterate through card slot panels and vector of cards in hand when implemented
        miniCard curCard;

        for (int i = 0; i < rows; i++){
            for( int j = 0; j < cols; j++){
                curCard = new miniCard(hand.get(0));
                curCard.setCardPosition(startCol + (curCard.cardColSize + 1) * j, startRow + (curCard.cardRowSize + 1) * i);
                gameGrid.addComponent(curCard.getPanel());

                cardIndex++;
            }
        }

    }
}





