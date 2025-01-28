package it.unibo.monoopoly.model.gameboard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.unibo.monoopoly.model.api.gameboard.Cell;
import it.unibo.monoopoly.model.api.gameboard.GameBoard;
import it.unibo.monoopoly.model.api.player.Player;
import it.unibo.monoopoly.model.impl.gameboard.BuildableImpl;
import it.unibo.monoopoly.model.impl.gameboard.GameBoardImpl;
import it.unibo.monoopoly.model.impl.player.PlayerImpl;


public class GameBoardImplTest {

    static final List<Cell> CELLS_LIST = GameBoardImplTest.initializeCellsList();
    static final List<Player> PLAYERS_LIST = GameBoardImplTest.initializePlayersList();

    private GameBoard gameBoardImpl;

    private static List<Cell> initializeCellsList() {
        final List<Cell> cellsList = new LinkedList<>();
        cellsList.add(new BuildableImpl(null, "first", 100, 100));
        cellsList.add(new BuildableImpl(null, "second", 200, 200));
        cellsList.add(new BuildableImpl(null, "third", 300, 300));
        return cellsList;
    }

    private static List<Player> initializePlayersList() {
        final List<Player> playersList = new LinkedList<>();
        playersList.add(new PlayerImpl("Mario", 1500, 0, false));
        playersList.add(new PlayerImpl("Franco", 1500, 0, false));
        playersList.add(new PlayerImpl("Luigi", 1500, 0, false));
        return playersList;
    }

    @BeforeEach
    public void initialization() {
        this.gameBoardImpl = new GameBoardImpl(CELLS_LIST, PLAYERS_LIST);
    }

    @Test
    public void testGetCell() {
        assertEquals(this.CELLS_LIST.get(0), this.gameBoardImpl.getCell(0));
        assertNotEquals(this.CELLS_LIST.get(0), this.gameBoardImpl.getCell(1));
    }

}
