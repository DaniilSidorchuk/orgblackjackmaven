package org.blackjack.Enums;

public enum Mettle {

    Bold, Confident, Coward;

    public double chance(){
        switch (this){
            case Bold: return 0.25;
            case Confident: return 0.5;
            case Coward: return 0.75;
        }
        return 0;
    }

}
