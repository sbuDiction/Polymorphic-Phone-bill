package phone.smss;

import phone.PhoneBill;

public class SMSBundle extends PhoneBill {
    private double smsCost;
    private int qty;

    public SMSBundle(int qty, double smsCost) {
        this.smsCost = smsCost;
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public double getSmsCost() {
        return smsCost;
    }
}
