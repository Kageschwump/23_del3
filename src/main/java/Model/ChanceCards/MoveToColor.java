package Model.ChanceCards;

import Controller.GuiHandler;
import Model.ChanceCard;
import Model.GameBoard;
import Model.Player.Player;
import Model.RuleSet;

import java.awt.*;

public class MoveToColor extends ChanceCard {

    private String desc = "Du er landet på et Chance! Ryk til et felt af farven ";
    private String totalDesc;
    private String whichFieldColor;
    private GameBoard gameBoard;
    private RuleSet ruleSet;
    private GuiHandler guiHandler;

    public MoveToColor(String whichFieldColor, GameBoard gameBoard, RuleSet ruleSet, GuiHandler guiHandler)
    {
        this.ruleSet = ruleSet;
        this.whichFieldColor = whichFieldColor;
        this.gameBoard = gameBoard;
        this.guiHandler = guiHandler;
        totalDesc = desc + whichFieldColor;
    }

    @Override
    public void cardFunction(Player player)
    {
        int[] arrayOfPlacements = new int[2];
        String wishedPlacement;

        Color color = super.fromStringToColor(whichFieldColor);
        arrayOfPlacements = ruleSet.squaresOfSameColor(color);
        wishedPlacement = guiHandler.getGui().getUserButtonPressed(totalDesc,gameBoard.getSquares()[0].getName(),gameBoard.getSquares()[1].getName());
        for(int i = 0; i < gameBoard.getSquares().length; i++)
        {
            if(gameBoard.getSquares()[i].getName().equals(wishedPlacement))
            {
                player.setPlacement(i);
            }
        }
    }


    @Override
    public String getDesc() {
        return totalDesc;
    }
}
