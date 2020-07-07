package phone.smss;

import org.junit.Test;
import phone.PhoneBill;

import static org.junit.Assert.assertEquals;

public class SmsTest {
    @Test
    public void dataBundlesTest() {
        PhoneBill bill = new PhoneBill();
        SMSBundle sms = new SMSBundle(500, 0.35);
        bill.accept(sms);
        assertEquals(175.0, bill.totalCost(), 0.1);
    }
}
