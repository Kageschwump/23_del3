package Model.SquareTypes;

import Model.GameSquare;
import Model.Player.Player;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;

import java.awt.*;

public class PrisonSquare extends GameSquare {

    private String name = "Fængsel";
    private String description = "";
    private Color bgColor = Color.white;
    private Color fgColor = Color.black;
    private GUI_Field fieldType;

    public PrisonSquare()
    {
        fieldType = new GUI_Jail("default",name,"Gå i fængsel", description,bgColor,fgColor);
    }

    @Override
    public void function(Player player)
    {
        if(!player.isJailFreeCard())
        {
            player.setPlacement(6);
            player.getAccount().updateScore(-1);
            this.description = "Surt show, du røg i fængsel. du betaler 1 penge for at blive løsladt";
        }

        else{
            player.setPlacement(6);
            this.description = "Du røg i fængsel, men du bliver løsladt gratis da du har et chancekort";
            player.setJailFreeCard(false);
        }
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public GUI_Field getGuiField() {
        return fieldType;
    }

    @Override
    public String getDesc() {
        return description;
    }

    @Override
    public Color getColor() {
        return bgColor;
    }
}
