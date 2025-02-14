package it.unibo.monoopoly.model.api.player;

import java.util.List;
import java.util.Optional;

import it.unibo.monoopoly.common.Event;
import it.unibo.monoopoly.model.api.ModelState;
import it.unibo.monoopoly.model.api.gameboard.Cell;
import it.unibo.monoopoly.model.api.gameboard.GameBoard;

/**
 * Interface representing the turn of a player.
 */
public interface Turn {

    /**
     * Executes the move phase of the player's turn.
     */
    void movePhase();

    /**
     * Executes the construction phase of the player's turn.
     */
    void constructPhase();

    /**
     * Check the relation between the active {@link Player} and the {@link Cell} is on.
     * @return the type of event, if one occurs
     */
    Optional<Event> checkAction();

    /**
     * Rolls the dice for the player's turn.
     * 
     * @return the result of the dice roll
     */
    int rollDice();

    /**
     * Gets the current phase of the player's turn.
     * 
     * @return the current phase.
     */
    Player getPhase();

    /**
     * Gets the actual {@link Player}
     * 
     * @return the actual {@link Player}.
     */
    Player getActualPlayer();
    /**
     * Gets the list of all {@link cell} of the game.
     * 
     * @return the list of {@link cell}.
     */
    List<Cell> getCellsList();
    /**
     * Set the {@link ModelState} of the model.
     * 
     * @param state to set.
     */
    void setState(ModelState<?, ?> state);

    /**
     * Gets the {@link GameBoard}.
     * 
     * @return the {@link GameBoard}.
     */
    GameBoard getGameBoard();

    /**
     * 
     * @return next correct {@link ModelState} to execute the event triggered by a {@link Cell}.
     */
    ModelState<?,?> getCheckActionState();

}
