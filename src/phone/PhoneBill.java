package phone;

import phone.calls.PhoneCall;
import phone.databundles.DataBundle;
import phone.smss.SMSBundle;

public class PhoneBill implements BillAction {
    private double total;

    public void accept(BillAction billAction) {
        if (billAction instanceof PhoneCall) {
            total += ((PhoneCall) billAction).getCallCost();
        } else if (billAction instanceof SMSBundle) {
            total += ((SMSBundle) billAction).getQty() * ((SMSBundle) billAction).getSmsCost();
        } else if (billAction instanceof DataBundle) {
            total += ((DataBundle) billAction).getDataCost();
        }
    }

    @Override
    public double totalCost() {
        return total;
    }
}
