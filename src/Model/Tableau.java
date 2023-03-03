package Model;

import Model.Cards.Card;

public class Tableau {
    Card[][] tableau;
    Tableau() {
        Card[][] tableau = new Card[4][4];
    }

    Card getCardFromTableau(int row, int col) { return tableau[row][col];}
    void plant(Card card, int hor_pos, int ver_pos) {
        tableau[hor_pos][ver_pos] = card;
    }
}
