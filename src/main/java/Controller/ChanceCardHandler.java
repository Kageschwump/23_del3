package Controller;

import Model.ChanceCard;
import Model.GameBoard;
import Model.Player.Player;
import Model.RuleSet;

import java.awt.*;

public class ChanceCardHandler
{
    private ChanceCard[] cards;
    private GameBoard gameBoard;
    private RuleSet ruleSet;
    private GuiHandler guiHandler;

    public ChanceCardHandler(GameBoard gameBoard, RuleSet ruleSet, GuiHandler guiHandler)
    {
        this.ruleSet = ruleSet;
        this.gameBoard = gameBoard;
        this.guiHandler = guiHandler;
        cards = new ChanceCard[20];
        createCards();
    }

    public void createCards()
    {

    }

    public void drawCard(Player player)
    {
        int randomCard = ((int) Math.random() * 20);

        cards[randomCard].cardFunction(player);
    }

    // Ryk frem til farvet felt (Color) (y)
    // Betal kort (y)
    // Get out of Jail
    // Ryk op til X felter frem
    // Ryk frem til property
}
