package Model.SquareTypes;

import Model.GameSquare;
import Model.Player;
import gui_fields.GUI_Field;

public class StartSquare extends GameSquare {

    private String name;
    private int squareNumber;
    private GUI_Field fieldType;
    private int passStart = 2;

    @Override
    public void function(Player player) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public GUI_Field getGuiField() {
        return null;
    }
}
