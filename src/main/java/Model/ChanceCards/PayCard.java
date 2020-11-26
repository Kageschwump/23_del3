package Model.ChanceCards;

import Model.ChanceCard;
import Model.Player.Player;

public class PayCard extends ChanceCard {

    private String desc = "Du har spist for meget slik! Betal 2 til banken";

    @Override
    public void cardFunction(Player player) {
        player.getAccount().updateScore(-2);
        player.getGuiPlayer().setBalance(player.getAccount().getBalance());
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
