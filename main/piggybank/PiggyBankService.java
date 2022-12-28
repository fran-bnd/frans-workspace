package main.piggybank;

public class PiggyBankService {
    PiggyBank bank;  // this is null untill instantiated

    /**
     * no-args constructor for the service
     */
    public PiggyBankService(){
        bank = new PiggyBank();
    }

    /**
     * starting from the bank's string startin
     */
    public void depositQuarter(){
        if(bank.broken==false){
            double oldamount = bank.amount;
            double newamount = oldamount + .25;
            bank.amount = newamount;
        }
    }

    public double breakPiggyBank(){
        bank.broken = true;
        return bank.amount;
    }
    
}
