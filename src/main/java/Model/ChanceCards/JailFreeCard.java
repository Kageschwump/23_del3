package Model.ChanceCards;

import Model.ChanceCard;
import Model.Player.Player;
import Model.RuleSet;

public class JailFreeCard extends ChanceCard {

    private String desc = "Chance! Du løslades næste gang uden omkostninger";
    private RuleSet ruleSet;

    public JailFreeCard(RuleSet ruleSet)
    {
        this.ruleSet = ruleSet;
    }

    @Override
    public void cardFunction(Player player) {
        player.setJailFreeCard(true);
        ruleSet.getChanceCardHandler().getGuiHandler().printMessage(desc);
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
