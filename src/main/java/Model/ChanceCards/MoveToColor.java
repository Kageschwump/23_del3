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


    public MoveToColor(Color color1, Color color2, GameBoard gameBoard, RuleSet ruleSet)
    {
        this.ruleSet = ruleSet;
        this.color1 = color1;
        this.color2 = color2;
        this.gameBoard = gameBoard;
        desc = "Du er landet på et Chance! Ryk til et felt ";
    }

    public MoveToColor(Color color1, GameBoard gameBoard, RuleSet ruleSet)
    {
        this.ruleSet = ruleSet;
        this.color1 = color1;
        this.gameBoard = gameBoard;
        desc = "Du er landet på et Chance! Ryk til et felt ";
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
        wishedPlacement = ruleSet.getChanceCardHandler().getGuiHandler().getGui().getUserSelection(desc,gameBoard.getSquares()[placements[0]].getName(),gameBoard.getSquares()[placements[1]].getName());
        for(int i = 0; i < gameBoard.getSquares().length; i++)
        {
            if(wishedPlacement.equals(gameBoard.getSquares()[i].getName()))
            {
                player.setPlacement(i);
                gameBoard.getSquares()[player.getPlacement()].function(player);
                break;
            }
        }
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
