package Model.ChanceCards;

import Model.ChanceCard;
import Model.Player.Player;
import Model.RuleSet;

public class MoveNumOfFields extends ChanceCard {

    private int numOfFields;
    private String desc = "Chance! Ryk " + numOfFields + " felter";
    private RuleSet ruleSet;

    public MoveNumOfFields(int numOfFields, RuleSet ruleSet)
    {
        this.numOfFields = numOfFields;
        this.ruleSet = ruleSet;
    }

    @Override
    public void cardFunction(Player player) {
        player.updatePlacement(numOfFields);
        ruleSet.getChanceCardHandler().getGuiHandler().printMessage(desc);
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
