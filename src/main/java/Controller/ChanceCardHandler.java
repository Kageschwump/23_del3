package Controller;

import Model.ChanceCard;
import Model.ChanceCards.MoveNumOfFields;
import Model.ChanceCards.MoveToColor;
import Model.ChanceCards.PayCard;
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

    public ChanceCardHandler()
    {
        cards = new ChanceCard[3];
    }

    public void createCards()
    {
        cards[0] = new MoveToColor(Color.BLUE,gameBoard,ruleSet,guiHandler);
        cards[1] = new MoveToColor(Color.YELLOW,gameBoard,ruleSet,guiHandler);
        cards[2] = new MoveToColor(Color.lightGray,gameBoard,ruleSet,guiHandler);
    }

    public void drawCard(Player player)
    {
        int randomCard = (int) (Math.random() * 3);

        cards[randomCard].cardFunction(player);
    }


    public void setGameBoard(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    public void setRuleSet(RuleSet ruleSet) {
        this.ruleSet = ruleSet;
    }

    public GuiHandler getGuiHandler() {
        return guiHandler;
    }

    public void setGuiHandler(GuiHandler guiHandler) {
        this.guiHandler = guiHandler;
    }

    // Ryk frem til farvet felt (Color) (y)
    // Betal kort (y)
    // Get out of Jail
    // Ryk op til X felter frem
    // Ryk frem til property
}
