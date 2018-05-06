package org.blackjack.CardsClasses;

import org.blackjack.Enums.Rang;
import org.blackjack.Enums.Suit;

public class Card {

    private Suit suit;
    private Rang rang;
    private int points;

    public Card(Suit suit, Rang rang) {
        this.suit = suit;
        this.rang = rang;
        this.points = rang.value();
    }

    public Suit getSuit() {
        return suit;
    }

    public Rang getRang() {
        return rang;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){return false;}
        if (!(obj instanceof Card)){return false;}
        Card card = (Card) obj;

        if (this.getSuit().equals(card.getSuit()) && this.getRang().equals(card.getRang())){
            return true;
        }
        return false;
    }

    public boolean sameRangs (Card card){
        return this.getRang().equals(card.getRang())? true:false;
    }

}



