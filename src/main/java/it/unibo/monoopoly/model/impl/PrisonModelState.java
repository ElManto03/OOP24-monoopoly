package it.unibo.monoopoly.model.impl;

import it.unibo.monoopoly.model.api.ModelState;
import it.unibo.monoopoly.model.api.player.Player;

public class PrisonModelState implements ModelState<Boolean, String> {   

    private final Player player;
    private String message;

    public PrisonModelState(Player player) {
        this.player = player;
    }

    @Override
    public void verify() {
        if (player.isPrisoned()) {
            message = "You are in prison, you can't move";
        } else {
            message = "You are not in prison, you can move";
        }
    }

    @Override
    public void doAction(Boolean useCard){
        if (!player.isPrisoned()) {
            message = "You are not in prison, you can move";
            return;
        }

        if (useCard != null && useCard) {
            if (player.getFreeJailCards() > 0) {
                boolean used = player.useGetOutOfJailCard();
                if (used) {
                    message = "You used a get out of jail card";
                } else {
                    message = "You don't have any get out of jail card";
                }
            } else {
                message = "Cannot use a get out of jail card, you don't have any";
            }
        } else {
            if (player.isPayable(50)) {
                player.pay(50);
                message = "You paid 50 and you are out of prison";
                player.releaseFromPrison();
            } else {
                message = "You can't afford to pay, you risk bankruptcy.";
            }
        }
    }

    @Override
    public String getData() {
        return message;
    }

    @Override
    public void closeState() {
        
    }
}