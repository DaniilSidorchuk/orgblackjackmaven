package org.blackjack;

import org.blackjack.CardsClasses.Card;
import org.blackjack.Enums.Mettle;
import org.blackjack.Enums.Rang;
import org.blackjack.Enums.Suit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    Player player = new Player("John", Mettle.Coward);

    @Before
    public void preparation(){
        Card card1 = new Card(Suit.Hearts, Rang.ACE);
        Card card2 = new Card(Suit.Hearts, Rang.FIVE);

        player.getStartingCards();
        player.getCardsPocket().addCard(card1);
        player.getCardsPocket().addCard(card2);

    }

    @Test
    public void testStopGame() {

        boolean actual = player.stopGame();
        assertEquals(true, actual);

    }
}