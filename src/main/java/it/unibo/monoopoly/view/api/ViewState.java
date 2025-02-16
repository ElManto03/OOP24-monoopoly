package it.unibo.monoopoly.view.api;
/**
 * The model of the pattern State for the view.
 */
public interface ViewState {
    /**
     * Set the state ready to be execute.
     * @param set a possible data to help the setup.
     */
    void setMode(boolean set);
    /**
     * Display all the views necessary for the state.
     */
    void visualize();

}
