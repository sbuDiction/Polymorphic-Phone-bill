package phone.calls;

import org.junit.Test;
import phone.PhoneBill;

import static org.junit.Assert.assertEquals;

public class CallsTest {

    @Test
    public void makeCallTest() {
        PhoneCall call = new PhoneCall(1.50);
        PhoneBill bill = new PhoneBill();
        bill.accept(call);
        bill.accept(call);
        bill.accept(call);
        assertEquals(4.5, bill.totalCost(), 0.1);
    }
}
