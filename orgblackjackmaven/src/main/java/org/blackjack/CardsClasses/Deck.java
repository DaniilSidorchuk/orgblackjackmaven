package org.blackjack.CardsClasses;

import org.blackjack.Arrays.ArrayOfRangs;
import org.blackjack.Arrays.ArraysOfSuits;
import org.blackjack.Enums.Rang;
import org.blackjack.Enums.Suit;
import org.blackjack.Arrays.ArraysOfSuits;

import java.util.ArrayList;

public class Deck {

    ArrayList <Card> deck = new ArrayList(52);



    public Deck() {
        ArrayList <Rang> rang = createArrayListOfRangs();
        for (int i = 0; i < 13; i++) {
            int index = (int) Math.random()*rang.size();
            for (int j = 0; j < ArraysOfSuits.suit.length; j++) {
                deck.add(new Card(ArraysOfSuits.suit[j],rang.get(index)));
            }
            rang.remove(index);
        }
    }

    private ArrayList createArrayListOfRangs(){
        ArrayList rangs = new ArrayList(ArrayOfRangs.rangs.length);
        for (int j = 0; j < ArrayOfRangs.rangs.length; j++) {
            rangs.add(ArrayOfRangs.rangs[j]);
        }
        return rangs;
    }

    public Card randomCard(){

        int suitRandomIndex = (int) (Math.random() * 3);
        int rangsRandomIndex = (int) (Math.random() * 12);

        return new Card(ArraysOfSuits.suit[suitRandomIndex], ArrayOfRangs.rangs[rangsRandomIndex]);

    }

    public void reduceDeck(Card card){
        deck.remove(card);
    }

    public void shuffleTheDeck(){
        int randomNumber = (int) (Math.random() * 25) +10;

        for (int i = 0; i < randomNumber; i++) {
            int index1 = (int) (Math.random() * deck.size());
            int index2 = (int) (Math.random() * deck.size());
           Card card = deck.get(index1);
           deck.set(index1, deck.get(index2));
           deck.set(index2,card);
        }
    }


}
