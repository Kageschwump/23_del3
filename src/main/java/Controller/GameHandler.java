package Controller;

import Model.Dice;
import Model.GameBoard;

public class GameHandler {

    private Dice dice;
    private GameBoard gameBoard;
    private PlayerHandler playerHandler;

    public GameHandler()
    {
        this.dice = new Dice();
        this.gameBoard = new GameBoard();
        this.playerHandler = new PlayerHandler();
    }

    public void round()
    {

    }

    public void startGame()
    {

    }

    public int numberOfPlayer(){

        return 0;
    }

    public GameBoard getGameBoard() {
        return gameBoard;
    }

}
