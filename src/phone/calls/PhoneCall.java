package phone.calls;

import phone.PhoneBill;

public class PhoneCall extends PhoneBill {
    public double callCost;

    public PhoneCall(double callCost) {
        this.callCost = callCost;
        System.out.println(this.callCost);
    }
}
