package Hw;

public class GoldCard extends CreditCard{
    private static int INITIAL_BALANCE_GOLD=1000;

    public GoldCard(String cardType, int cardPin,String cardNumber, int initialBalance) {
        super(cardType, cardPin,cardNumber);
        this.INITIAL_BALANCE_GOLD=initialBalance;
    }

    public static int getInitialBalanceGold() {
        return INITIAL_BALANCE_GOLD;
    }

    public static void setInitialBalanceGold(int initialBalanceGold) {
        INITIAL_BALANCE_GOLD = initialBalanceGold;
    }
}
