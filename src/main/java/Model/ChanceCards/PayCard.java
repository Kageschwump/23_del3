package Model.ChanceCards;

import Model.ChanceCard;
import Model.Player.Player;

public class PayCard extends ChanceCard {

    private String desc;
    int payAmount;

    public PayCard(int payAmount, String desc)
    {
        this.desc = desc;
        this.payAmount = payAmount;
    }

    @Override
    public void cardFunction(Player player) {
        player.getAccount().updateScore(payAmount);
    }

    @Override
    public String getDesc() {
        return desc + ". " + payAmount;
    }
}
