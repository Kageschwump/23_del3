package Model.ChanceCards;

import Model.ChanceCard;
import Model.Player.Player;

public class MoveCard extends ChanceCard {

    private String desc = "Ryk frem til ";
    private String totalDesc;
    private String whichFieldColor;

    public MoveCard(String whichFieldColor)
    {
        this.whichFieldColor = whichFieldColor;
        totalDesc = desc + whichFieldColor;
    }

    @Override
    public void cardFunction(Player player) {

    }


    @Override
    public String getDesc() {
        return totalDesc;
    }
}
