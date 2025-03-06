package it.unibo.monoopoly.controller.data.api;

import java.util.Map;

import it.unibo.monoopoly.common.Event;
import it.unibo.monoopoly.controller.data.impl.DataInput;
import it.unibo.monoopoly.model.gameboard.api.Dices.Pair;

/**
 * The builder of the {@link DataInput} that contains all information for the gui.
 */
public interface DataBuilderInput {
    /**
     * Fluent method that insert a {@link Map} {@link Player} index -> amount of money, in the {@link DataInput}.
     * @param map to insert.
     * @return this.
     */
    DataBuilderInput cellMap(Map<Integer, Integer> map);

    /**
     * Fluent method that insert a {@link Pair} of the result of {@link Dices}, in the {@link DataInput}.
     * @param dices to insert.
     * @return this.
     */
    DataBuilderInput dices(Pair dices);

    /**
     * Fluent method that insert the {@link Event} taken from the {@link MainModel}, in the {@link DataInput}.
     * @param event to insert.
     * @return this.
     */
    DataBuilderInput event(Event event);

    /**
     * Fluent method that insert a boolean useful to make decision, in the {@link DataInput}.
     * @param mode to insert.
     * @return this.
     */
    DataBuilderInput mode(boolean mode);

    /**
     * Fluent method that insert a {@link String} to set some text, in the {@link DataInput}.
     * @param text to insert.
     * @return this.
     */
    DataBuilderInput text(String text);

    /**
     * Fluent method that insert a {@link Integer} that represents a value to pay, in the {@link DataInput}.
     * @param value to insert.
     * @return this.
     */
    DataBuilderInput valueToPay(Integer value);

    /**
     * The method to return the built product.
     * @return product.
     */
    DataInput build();
}
