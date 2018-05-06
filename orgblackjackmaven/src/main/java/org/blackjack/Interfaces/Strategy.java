package org.blackjack.Interfaces;
@FunctionalInterface
public interface Strategy {

    boolean sayStop(double currentValue);

}
