package Model;

import Model.Player.Player;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;

import java.awt.*;

public abstract class GameSquare {

    public abstract void function(Player player);

    public abstract String getName();

    public abstract GUI_Field getGuiField();

    public abstract String getDesc();

    public abstract Color getColor();

}

