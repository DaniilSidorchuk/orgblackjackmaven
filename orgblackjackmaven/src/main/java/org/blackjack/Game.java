package org.blackjack;
import org.blackjack.CardsClasses.Card;
import org.blackjack.CardsClasses.Deck;
import org.blackjack.Enums.Mettle;

public class Game {

   private int games;
   private Deck deck = new Deck();
   private Player player1 = new Player("Player1", Mettle.Bold);
   private Player player2 = new Player("Player2", Mettle.Confident);
   private Player player3 = new Player("Player3", Mettle.Coward);
   private Player[] players = new Player[]{player1,player2,player3};

    public Game(int games) {
        this.games = games;
    }

    private void startGame(){
        player1.getStartingCards();
        player2.getStartingCards();
        player3.getStartingCards();
        for (int i = 0; i < 3; i++) {
            Card card = deck.randomCard();
            players[i].getCardsPocket().addCard(card);
            deck.reduceDeck(card);
            deck.shuffleTheDeck();
            card = deck.randomCard();
            players[i].getCardsPocket().addCard(card);
            deck.reduceDeck(card);
            deck.shuffleTheDeck();
        }


    }

    private void round(){
        startGame();
        int [] results = new int[3];
        for (int i = 0; i < players.length; i++) {
            while (!players[i].stopGame()){
                Card card = deck.randomCard();
                players[i].getCardsPocket().addCard(card);
                deck.reduceDeck(card);
                deck.shuffleTheDeck();
            }
            if (players[i].amountOfPoints()<=21){
                results[i] = players[i].amountOfPoints();
            }
        }
        if (results[0]>results[1] && results[0]>results[2]){
            players[0].setWins(players[0].getWins()+1);
        }
        if (results[1]>results[0] && results[1]>results[2]){
            players[1].setWins(players[1].getWins()+1);
        }
        if (results[2]>results[1] && results[2]>results[0]){
            players[2].setWins(players[2].getWins()+1);
        }


    }

    void game (){
        while (games>0){
            round();
            games--;
            deck = new Deck();
        }
        printStatistic();
    }

    private void printStatistic() {
        System.out.println(player1.getName() + " " + player1.getMettle() + " " + "has " + player1.getWins() + " " + "wins");
        System.out.println(player2.getName() + " " + player2.getMettle() + " " + "has " + player2.getWins() + " " + "wins");
        System.out.println(player3.getName() + " " + player3.getMettle() + " " + "has " + player3.getWins() + " " + "wins");
    }

}
