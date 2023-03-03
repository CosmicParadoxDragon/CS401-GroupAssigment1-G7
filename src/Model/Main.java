// This contains a running instance of the game.

package Model;

class Main {
    public static void main(String[] args) {
            Game currentGame = new Game(2);
            System.out.println(currentGame.getPlayers().get(0).getName());
        }
}