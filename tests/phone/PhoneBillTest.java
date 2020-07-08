package phone;

import org.junit.Test;
import phone.calls.PhoneCall;

import static org.junit.Assert.assertEquals;

public class PhoneBillTest {
    @Test
    public void acceptMethod() {
        PhoneBill phoneBill = new PhoneBill();
        PhoneCall call = new PhoneCall(1.25);
        phoneBill.accept(call);
        phoneBill.accept(call);
        assertEquals(2.5, phoneBill.totalCost(), 0.01);
    }
}
