package Model.ChanceCards;

import Model.ChanceCard;
import Model.Player.Player;

public class JailFreeCard extends ChanceCard {
    private String desc = "Du løslades næste gang uden omkostninger";


    @Override
    public void cardFunction(Player player) {
        player.setJailFreeCard(true);
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
