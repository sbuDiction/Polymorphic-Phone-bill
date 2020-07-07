package phone.smss;

import phone.BillAction;

public class SMSBundle implements BillAction {
    private double smsCost;
    private int qty;

    public SMSBundle(int qty, double smsCost) {
        this.smsCost = smsCost;
        this.qty = qty;
    }

    @Override
    public double totalCost() {
        return qty * smsCost;
    }
}
