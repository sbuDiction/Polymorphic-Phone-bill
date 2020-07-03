package phone;

import phone.calls.PhoneCall;
import phone.databundles.DataBundle;
import phone.smss.SMSBundle;

public class PhoneBill implements BillAction {
    private double total;

    public void accept(BillAction billAction) {
        if (billAction instanceof PhoneCall) {
            call(((PhoneCall) billAction).callCost);
        } else if (billAction instanceof SMSBundle) {
            sms(((SMSBundle) billAction).qty, ((SMSBundle) billAction).smsCost);
        } else if (billAction instanceof DataBundle) {
            data(((DataBundle) billAction).dataCost);
        }
    }

    @Override
    public double totalCost() {
        return total;
    }

    @Override
    public void call(double cost) {
        total += cost;
    }

    @Override
    public void sms(int qty, double cost) {
        total += qty * cost;
    }

    @Override
    public void data(double cost) {
        total += cost;
    }
}
