package Model.ChanceCards;

import Controller.GuiHandler;
import Model.ChanceCard;
import Model.GameBoard;
import Model.Player.Player;
import Model.RuleSet;

import java.awt.*;

public class MoveToColor extends ChanceCard {

    private String desc;
    private GameBoard gameBoard;
    private Color color1;
    private Color color2;
    private RuleSet ruleSet;
    private GuiHandler guiHandler;

    public MoveToColor(Color color1, Color color2, GameBoard gameBoard, RuleSet ruleSet, GuiHandler guiHandler)
    {
        this.ruleSet = ruleSet;
        this.color1 = color1;
        this.color2 = color2;
        this.gameBoard = gameBoard;
        this.guiHandler = guiHandler;
        desc = "Du er landet på et Chance! Ryk til et felt af farven " + color1.toString() + " eller " + color2.toString();
    }

    public MoveToColor(Color color1, GameBoard gameBoard, RuleSet ruleSet, GuiHandler guiHandler)
    {
        this.ruleSet = ruleSet;
        this.color1 = color1;
        this.gameBoard = gameBoard;
        this.guiHandler = guiHandler;
        desc = "Du er landet på et Chance! Ryk til et felt af farven " + color1.toString();
    }

    @Override
    public void cardFunction(Player player)
    {
        int[] arrayOfPlacements1;

        arrayOfPlacements1 = ruleSet.squaresOfSameColor(color1);
        changePlayerPlacement(player,arrayOfPlacements1);

    }

    public void changePlayerPlacement(Player player, int[] placements)
    {
        String wishedPlacement;

        for(int i = 0; i < gameBoard.getSquares().length; i++)
        {
            if(true)
            {
                player.setPlacement(i);
            }
        }
    }


    @Override
    public String getDesc() {
        return desc;
    }
}
