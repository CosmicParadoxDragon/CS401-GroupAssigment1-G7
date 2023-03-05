// This contains a running instance of the game.
package Model;

import View.gameTui;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {

    Game currentGame = new Game(1);

    gameTui Interface = new gameTui(currentGame);
  }
}