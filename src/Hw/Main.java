package Hw;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        CreditCardService ccs = new CreditCardService();
        ArrayList<CreditCard> creditCards = ccs.fetchCreditCards();

        ATM atm = new ATM();
        ArrayList<Integer> bills = atm.fetchAtmBills();

        System.out.println("Welcome! Please choose:");
        System.out.println("1. Display card balance \n2. Start a withdrawal \n3. EXIT");
        int option = Integer.parseInt(z.nextLine());


        while (option != 3) {
            if(option==1){

                int value=0;
                   for (int i = 0; i < creditCards.size(); i++) {
                       if(validateCard(creditCards)) {
                           value=1;
                           System.out.println("Balance: " + creditCards.get(i).getInitialBalace());
                           break;
                       }else{
                           break;
                       }

                   }
                if(value==0){
                   System.out.println("Wrong elements. Please try again!");
                }

            }

            if (option == 2) {
                int value=0;
                int s=countBills(atm.fetchAtmBills());
                for (int i = 0; i < creditCards.size(); i++) {
                    int balance=ccs.fetchCreditCards().get(i).getInitialBalace();
                    if(validateCard(creditCards)) {
                        value=1;
                        System.out.println("How much would you like to withdraw?");
                        int amount = Integer.parseInt(z.nextLine());

                        if(balance>=amount){
                            balance=balance-amount;
                            System.out.println("Remaining balance: "+balance+".");
                            break;
                        }else if(balance%s!=0){
                            System.out.println("The machine does not have enough funds, please enter a smaller amount");
                            break;
                        }
                        else{
                            System.out.println("Insufficient Funds");
                            break;
                        }

                    }else{
                        value=0;
                        break;
                    }

                }
                if(value==0){
                    System.out.println("Wrong elements. Please try again!");
                }

            }

            System.out.println("Would you like to make another operation?");
            System.out.println("1. Display card balance \n2. Start a withdrawal \n3. EXIT");
            option = Integer.parseInt(z.nextLine());
        }


    }


    public static boolean validateCard(ArrayList<CreditCard> creditCards){
        Scanner z=new Scanner(System.in);
        int value1=0;
        int value2=0;

        CreditCardService ccs = new CreditCardService();
         creditCards = ccs.fetchCreditCards();

        System.out.println("Please enter your card number:");
        String cardNumber = z.nextLine();

        for (int i = 0; i < creditCards.size(); i++) {

            if (cardNumber.equals(creditCards.get(i).getCardNumber())) {
                value1=1;
                System.out.println("Enter PIN:");
                int cardPin = Integer.parseInt(z.nextLine());

                if (cardPin == CreditCard.getPIN()) {
                    value2=1;
                }
            }
        }

        return value1 == 1 && value2 == 1;
    }

    public static int countBills(ArrayList<Integer> bills){
        int counter=0;
        for (int i = 0; i < bills.size(); i++) {
            counter++;
        }
        return counter;
    }



}


