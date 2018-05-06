package org.blackjack;

import org.blackjack.Enums.Mettle;
import org.blackjack.Interfaces.Strategy;

public class StrategyHelper {

    public static Strategy selectStrategy (Player player){
        double strategy = player.getMettle().chance();
        Strategy str =(s) ->{
            if (player.getCardsPocket().checkChance()>s){
        return false;
             }
        return true;
        };
        return str;
    }

}
