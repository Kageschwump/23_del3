package Controller;

import Model.ChanceCard;
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
    private ChanceCardHandler chanceCardHandler;

    public GameHandler()
    {
        this.chanceCardHandler = new ChanceCardHandler();
        this.dice = new Dice();
        this.gameBoard = new GameBoard(chanceCardHandler);
        this.ruleset = new RuleSet(gameBoard, chanceCardHandler);
    }

    public void round(Player player)
    {
        int facevalue = dice.roll();
        guiHandler.playerRoll(player.getName());
        guiHandler.getRoll(facevalue);
        guiHandler.resetCars(player,playerHandler.getPlayers(),gameBoard.getFields()[player.getPlacement()]);
        playerHandler.updatePlacement(facevalue, player);
        gameBoard.getSquares()[player.getPlacement()].function(player);
        gameBoard.getFields()[player.getPlacement()].setCar(player.getGuiPlayer(),true);
        guiHandler.printMessage(gameBoard.getSquares()[player.getPlacement()].getDesc());

    }

    public void startGame()
    {
        gameBoard.getChanceCardHandler().setGameBoard(gameBoard);
        gameBoard.getChanceCardHandler().setRuleSet(ruleset);
        gameBoard.createGameBoard();
        guiHandler = new GuiHandler(gameBoard.createFields());
        gameBoard.getChanceCardHandler().setGuiHandler(guiHandler);
        gameBoard.getChanceCardHandler().createCards();
        playersSetup(guiHandler.playerCount());
        int starter = ruleset.determineStarter(playerHandler.getPlayers());
        guiHandler.printMessage(playerHandler.getPlayers()[starter].getName() + " starter");

        for(int i = 0; i < playerHandler.getPlayers().length; i++) {
            gameBoard.getFields()[0].setCar(playerHandler.getPlayers()[i].getGuiPlayer(),true);
        }

        while (!ruleset.gameOver(playerHandler.getPlayers())) {

            round(playerHandler.getPlayers()[starter]);
            starter++;
            if(starter >= playerHandler.getPlayers().length)
            {
                starter = 0;
            }
        }
        guiHandler.printMessage(ruleset.determineWinner(playerHandler.getPlayers()).getName() + " vandt!!!");
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
            playerHandler.getPlayers()[i] = playerHandler.createPlayer(i,guiHandler.playerString("Navn"),guiHandler.playerInt("Alder"),guiHandler.guiCreateCar(),startBalance);
            guiHandler.guiAddPlayer(playerHandler.getPlayers()[i].getGuiPlayer());
        }
    }
}
