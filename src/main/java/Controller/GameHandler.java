package Controller;

import Model.Dice;
import Model.GameBoard;
import Model.Player.Player;
import Model.RuleSet;

public class GameHandler {

    private Dice dice;
    private GameBoard gameBoard;
    private PlayerHandler playerHandler;
    private GuiHandler guiHandler;
    private RuleSet ruleset;

    public GameHandler()
    {
        this.dice = new Dice();
        this.gameBoard = new GameBoard();
        this.playerHandler = new PlayerHandler();
    }

    public void round(Player player)
    {
        int facevalue = dice.roll();

        guiHandler.getGui().getUserButtonPressed(null,"Roll");

    }

    public void startGame()
    {
        int starterIndex;
        guiHandler = new GuiHandler(gameBoard.createFields());
        guiHandler.guiMenu();
        starterIndex = ruleset.determineStarter(playerHandler.getPlayers());
        for(int i = 0; i < playerHandler.getPlayers().length; i++) {
            gameBoard.getFields()[0].setCar(playerHandler.getPlayers()[i].getGuiPlayer(), true);
        }

        while(!ruleset.gameOver()){
            round(playerHandler.getPlayers()[starterIndex]);
            starterIndex++;

            if(starterIndex >= playerHandler.getPlayers().length){
                starterIndex = 0;
            }
        }
    }

    public int numberOfPlayer(){

        return 0;
    }

    public GameBoard getGameBoard() {
        return gameBoard;
    }

    public PlayerHandler getPlayerHandler() {
        return playerHandler;
    }
}
