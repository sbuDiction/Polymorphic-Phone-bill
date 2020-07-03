package phone.smss;

import phone.BillAction;
import phone.PhoneBill;

public class SMSBundle extends PhoneBill {
    public double smsCost;
    public int qty;

    public SMSBundle(int qty, double smsCost) {
        this.smsCost = smsCost;
        this.qty = qty;

    }
}
