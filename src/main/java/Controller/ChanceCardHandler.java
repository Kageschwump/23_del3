package Controller;

import Model.ChanceCard;
import Model.ChanceCards.JailFreeCard;
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
        cards[0] = new MoveToColor(Color.BLUE,gameBoard,ruleSet);
        cards[1] = new MoveToColor(Color.YELLOW,gameBoard,ruleSet);
        cards[2] = new MoveToColor(Color.lightGray,gameBoard,ruleSet);
        cards[3] = new MoveToColor(Color.PINK, gameBoard, ruleSet);
        cards[4] = new JailFreeCard(ruleSet);
        cards[5] = new JailFreeCard(ruleSet);
        cards[6] = new JailFreeCard(ruleSet);
        cards[7] = new JailFreeCard(ruleSet);
        cards[8] = new MoveNumOfFields(2,ruleSet);
        cards[9] = new MoveNumOfFields(2,ruleSet);
        cards[10] = new MoveNumOfFields(2,ruleSet);
        cards[11] = new MoveNumOfFields(2,ruleSet);
        cards[12] = new PayCard(2,"Du fandt penge på jorden",ruleSet);
        cards[13] = new PayCard(-2, "Du har spist for meget slik",ruleSet);
        cards[14] = new PayCard(-5, "Din pung blev stjålet",ruleSet);
        cards[15] = new PayCard(5,"Du solgte en bil",ruleSet);
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
