package Controller;

import Model.ChanceCard;
import Model.ChanceCards.MoveNumOfFields;
import Model.ChanceCards.MoveToColor;
import Model.ChanceCards.PayCard;
import Model.GameBoard;
import Model.Player.Player;
import Model.RuleSet;

public class ChanceCardHandler
{
    private ChanceCard[] cards;
    private GameBoard gameBoard;
    private RuleSet ruleSet;
    private GuiHandler guiHandler;

    public ChanceCardHandler()
    {
        cards = new ChanceCard[9];
    }

    public void createCards()
    {
        cards[0] = new MoveNumOfFields(4);
        cards[1] = new MoveNumOfFields(4);
        cards[2] = new MoveNumOfFields(4);
        cards[3] = new MoveToColor("blue",gameBoard,ruleSet,guiHandler);
        cards[4] = new MoveToColor("green",gameBoard,ruleSet,guiHandler);
        cards[5] = new MoveToColor("lightgrey",gameBoard,ruleSet,guiHandler);
        cards[6] = new PayCard(2, "Du får 2 penge af banken");
        cards[7] = new PayCard(-2, "Din far straffer dig");
        cards[8] = new PayCard(-2, "Betal tilbage på gæld");
    }

    public void drawCard(Player player)
    {
        int randomCard = (int) (Math.random() * 9);

        cards[randomCard].cardFunction(player);
    }


    public void setGameBoard(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    public void setRuleSet(RuleSet ruleSet) {
        this.ruleSet = ruleSet;
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
