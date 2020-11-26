package Model.ChanceCards;

import Model.ChanceCard;
import Model.Player.Player;

public class MoveNumOfFields extends ChanceCard {

    private int numOfFields;
    private String desc = "Chance! Ryk " + numOfFields + " felter";

    public MoveNumOfFields(int numOfFields)
    {
        this.numOfFields = numOfFields;
    }

    @Override
    public void cardFunction(Player player) {
        player.setPlacement(numOfFields);
    }

    @Override
    public String getDesc() {
        return null;
    }
}
