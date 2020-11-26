package Model.ChanceCards;

import Model.ChanceCard;
import Model.Player.Player;

public abstract class JailFreeCard extends ChanceCard {
    private String desc = "Du løslades uden omkostninger";

    @Override
    public void cardFunction(Player player) {

    }

    @Override
    public String getDesc() {
        return null;
    }
}
