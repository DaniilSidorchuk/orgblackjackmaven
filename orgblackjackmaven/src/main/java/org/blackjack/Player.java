package org.blackjack;
import org.blackjack.CardsClasses.CardsPocket;
import org.blackjack.Enums.Mettle;

public class Player {

    private String name;
    private CardsPocket cardsPocket;
    private Mettle mettle;
    private int wins;

    public Player(String name, Mettle mettle) {
        this.name = name;
        this.mettle = mettle;
    }

    public void getStartingCards(){
        this.cardsPocket = new CardsPocket();
    }

    protected boolean stopGame(){
        return StrategyHelper.selectStrategy(this).sayStop(this.getMettle().chance());
    }

    public String getName() {
        return name;
    }

    public int amountOfPoints () {
        return cardsPocket.getAmountOfPoints();
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public CardsPocket getCardsPocket() {
        return cardsPocket;
    }

    public Mettle getMettle() {
        return mettle;
    }
}
