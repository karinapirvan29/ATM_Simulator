package Hw;

import java.util.ArrayList;
import java.util.Scanner;

public class CreditCard {


static int PIN=1234;
private String cartType;
private int initialBalance;
private String cardNumber;

    public CreditCard() {
    }

    public CreditCard(String cardType, int cardPin,String cardNumber){
        this.cartType=cardType;
        this.PIN=cardPin;
        this.cardNumber=cardNumber;
    }

    public CreditCard(String cardType, int cardPin,String cardNumber, int initialBalance){
       this(cardType,cardPin,cardNumber);
       if(initialBalance<=500){
           this.initialBalance=initialBalance;
       }else if(initialBalance<=1000){
           this.initialBalance=initialBalance;
       }
    }


    public static int getPIN() {
        return CreditCard.PIN;
    }

    public static void setPIN(int PIN) {
        CreditCard.PIN = PIN;
    }

    public String getCartType() {
        return cartType;
    }

    public void setCartType(String cartType) {

            this.cartType = cartType;
    }

    public int getInitialBalace(){
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        if(cardNumber.length()==16) {
            this.cardNumber = cardNumber;
        }else{
            System.out.println("Card number out of bounds. Please try again.");
        }
    }

}




