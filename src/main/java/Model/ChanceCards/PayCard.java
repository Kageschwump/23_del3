package Model.ChanceCards;

import Model.ChanceCard;
import Model.Player.Player;
import Model.RuleSet;

public class PayCard extends ChanceCard {

    private String desc;
    private int payAmount;
    private RuleSet ruleSet;

    public PayCard(int payAmount, String desc, RuleSet ruleSet)
    {
        this.desc = desc;
        this.payAmount = payAmount;
        this.ruleSet = ruleSet;
    }

    @Override
    public void cardFunction(Player player) {
        player.getAccount().updateScore(payAmount);
        ruleSet.getChanceCardHandler().getGuiHandler().printMessage(desc);
    }

    @Override
    public String getDesc() {
        return desc + ". " + payAmount;
    }
}
