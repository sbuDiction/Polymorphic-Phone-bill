package phone.calls;

import phone.BillAction;

public class PhoneCall implements BillAction {
    public double callCost;

    public PhoneCall(double callCost) {
        this.callCost += callCost;
    }

    @Override
    public double totalCost() {
        return callCost;
    }
}
