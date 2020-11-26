package Model;

import Model.Player.Player;

import java.awt.*;

public abstract class ChanceCard {

    private String chance = "Chance kort!";

    public abstract void cardFunction(Player player);

    public abstract String getDesc();

    public Color fromStringToColor(String colorString)
    {
        Color color;

        switch (colorString)
        {
            case "green":
                color = Color.GREEN;
                break;
            case "yellow":
                color = Color.YELLOW;
                break;
            case "blue":
                color = Color.BLUE;
                break;
            case "red":
                color = Color.RED;
                break;
            case "magenta":
                color = Color.magenta;
                break;
            case "cyan":
                color = Color.cyan;
                break;
            case "pink":
                color = Color.PINK;
                break;
            default:
                color = Color.lightGray;
        }
        return color;
    }


}
