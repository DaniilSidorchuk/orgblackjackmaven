package org.blackjack.CardsClasses;

import org.blackjack.Arrays.ArrayOfRangs;
import org.blackjack.Enums.Suit;



import java.util.ArrayList;
import java.util.Collections;

public class CardsPocket {

   private ArrayList <Card> pocket = new ArrayList();
   private int amountOfPoints;

    public void addCard (Card card){
        pocket.add(card);
        amountOfPoints+=card.getPoints();
    }

    public int getAmountOfPoints() {
        return amountOfPoints;
    }

    public double checkChance(){
        int freePoints = 21 - amountOfPoints;
        if (freePoints<=1){return 0;}
        int acceptableCards = 0;
        for (int i = 0; i < ArrayOfRangs.rangs.length ; i++) {
            if (freePoints<=ArrayOfRangs.rangs[i].value()){
                int card = 4;
                int sameCards = Collections.frequency(pocket,new Card(Suit.Hearts,ArrayOfRangs.rangs[i]));
                sameCards+=Collections.frequency(pocket,new Card(Suit.Clubs,ArrayOfRangs.rangs[i]));
                sameCards+=Collections.frequency(pocket,new Card(Suit.Spades,ArrayOfRangs.rangs[i]));
                sameCards+=Collections.frequency(pocket,new Card(Suit.Diamonds,ArrayOfRangs.rangs[i]));
                card-=sameCards;
                acceptableCards+=card;
            }
                    }
        return acceptableCards/52;

    }

}
