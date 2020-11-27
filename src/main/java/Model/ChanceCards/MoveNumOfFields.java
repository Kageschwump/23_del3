package Model.ChanceCards;

import Model.ChanceCard;
import Model.GameBoard;
import Model.Player.Player;
import Model.RuleSet;

public class MoveNumOfFields extends ChanceCard {

    private int numOfFields;
    private String desc = "Chance! Ryk " + numOfFields + " felter";
    private RuleSet ruleSet;
    private GameBoard gameBoard;

    public MoveNumOfFields(int numOfFields, RuleSet ruleSet, GameBoard gameBoard)
    {
        this.numOfFields = numOfFields;
        this.ruleSet = ruleSet;
        this.gameBoard = gameBoard;
    }

    @Override
    public void cardFunction(Player player) {
        player.updatePlacement(numOfFields);
        ruleSet.getChanceCardHandler().getGuiHandler().printMessage(desc);
        gameBoard.getSquares()[player.getPlacement()].function(player);
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
