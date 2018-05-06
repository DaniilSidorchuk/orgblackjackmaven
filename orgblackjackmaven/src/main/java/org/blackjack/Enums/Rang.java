package org.blackjack.Enums;

public enum Rang {

    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QEEN, KING, ACE;

    public int value(){
        switch (this){
            case ACE:return 11;
            case KING:return 4;
            case QEEN:return 3;
            case JACK:return 2;
            case TEN:return 10;
            case NINE:return 9;
            case EIGHT:return 8;
            case SEVEN:return 7;
            case SIX:return 6;
            case FIVE:return 5;
            case FOUR:return 4;
            case THREE:return 3;
            case TWO:return 2;
        }
        return 0;
    }

}
