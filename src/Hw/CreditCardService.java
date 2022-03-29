package Hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CreditCardService {

    public ArrayList<CreditCard> fetchCreditCards(){
        CreditCard a=new CreditCard("Basic card 1",CreditCard.getPIN(),"4557918195405289",BasicCard.getInitialBalanceBasic());
        CreditCard b=new CreditCard("Basic card 2",CreditCard.getPIN(),"4916000701556446",BasicCard.getInitialBalanceBasic());
        CreditCard c=new CreditCard("Gold card 1",CreditCard.getPIN(),"4055443714095526",GoldCard.getInitialBalanceGold());
        CreditCard d=new CreditCard("Basic card 3",CreditCard.getPIN(),"4024007122088825",BasicCard.getInitialBalanceBasic());
        CreditCard e=new CreditCard("Gold card 2",CreditCard.getPIN(),"4929183061195172",GoldCard.getInitialBalanceGold());
        CreditCard f=new CreditCard("Gold card 3",CreditCard.getPIN(),"4556194091861519",GoldCard.getInitialBalanceGold());
        CreditCard g=new CreditCard("Basic card 4",CreditCard.getPIN(),"4539442282565049",BasicCard.getInitialBalanceBasic());
        CreditCard h=new CreditCard("Basic card 5",CreditCard.getPIN(),"4024007171311839",BasicCard.getInitialBalanceBasic());
        CreditCard i=new CreditCard("Gold card 4",CreditCard.getPIN(),"4024007174708783",GoldCard.getInitialBalanceGold());
        CreditCard j=new CreditCard("Basic card 6",CreditCard.getPIN(),"4716891255020207",BasicCard.getInitialBalanceBasic());

        ArrayList<CreditCard> creditCards=new ArrayList<>();
        Collections.addAll(creditCards,a,b,c,d,e,f,g,h,i,j);

        return creditCards;

    }




}

