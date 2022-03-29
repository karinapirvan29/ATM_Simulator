package Hw;

public class BasicCard extends CreditCard{
    private static int INITIAL_BALANCE_BASIC=500;

    public BasicCard(String cardType, int cardPin,String cardNumber, int initialBalance) {
        super(cardType, cardPin,cardNumber);
        this.INITIAL_BALANCE_BASIC=initialBalance;
    }

    public static int getInitialBalanceBasic() {
        return INITIAL_BALANCE_BASIC;
    }

    public static void setInitialBalanceBasic(int initialBalanceBasic) {
        INITIAL_BALANCE_BASIC = initialBalanceBasic;
    }
}
