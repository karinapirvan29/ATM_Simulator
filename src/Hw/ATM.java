package Hw;

import java.util.ArrayList;
import java.util.Collections;

public class ATM {


    public ArrayList<Integer> fetchAtmBills() {

        ArrayList<Integer> fiveRON = new ArrayList<>();
        ArrayList<Integer> tenRON = new ArrayList<>();
        ArrayList<Integer> twentyRON = new ArrayList<>();
        ArrayList<Integer> fiftyRON = new ArrayList<>();
        ArrayList<Integer> oneHundredRON = new ArrayList<>();
        ArrayList<Integer> twoHundredRON = new ArrayList<>();
        ArrayList<Integer> fiveHundredRON = new ArrayList<>();

        Collections.addAll(fiveRON,5,5,5,5,5,5,5,5,5,5);
        Collections.addAll(tenRON,10,10,10,10,10,10,10,10,10,10);
        Collections.addAll(twentyRON,20,20,20,20,20,20,20,20,20,20);
        Collections.addAll(fiftyRON,50,50,50,50,50,50,50,50,50,50);
        Collections.addAll(oneHundredRON,100,100,100,100,100,100,100,100,100,100);
        Collections.addAll(twoHundredRON,200,200,200,200,200,200,200,200,200,200);
        Collections.addAll(fiveHundredRON,500,500,500,500,500,500,500,500,500,500);

        ArrayList<Integer> totalBills=new ArrayList<>();
        totalBills.addAll(fiveRON);
        totalBills.addAll(tenRON);
        totalBills.addAll(twentyRON);
        totalBills.addAll(fiftyRON);
        totalBills.addAll(oneHundredRON);
        totalBills.addAll(twoHundredRON);
        totalBills.addAll(fiveHundredRON);

        return totalBills;

    }


}





