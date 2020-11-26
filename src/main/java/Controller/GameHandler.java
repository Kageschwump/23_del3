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

    }

    public void round(Player player)
    {
        int facevalue = dice.roll();

    }

    public void startGame()
    {
        guiHandler = new GuiHandler(gameBoard.createFields());
        playersSetup(guiHandler.playerCount());
    }

    private void playersSetup(int playerCount)
    {
        playerHandler = new PlayerHandler(playerCount);
        int startBalance;

        switch (playerCount)
        {
            case 3:
                startBalance = 18;
                break;
            case 4:
                startBalance = 16;
                break;
            default:
                startBalance = 20;
        }

        for(int i = 0; i < playerCount; i++)
        {
            playerHandler.getPlayers()[i] = playerHandler.createPlayer(i,guiHandler.playerString("Name"),guiHandler.playerInt("Age"),guiHandler.guiCreateCar(),startBalance);
            guiHandler.guiAddPlayer(playerHandler.getPlayers()[i].getGuiPlayer());
        }


    }
}
