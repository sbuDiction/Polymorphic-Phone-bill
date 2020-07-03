package phone.databundles;

import org.junit.Test;
import phone.PhoneBill;
import phone.calls.PhoneCall;

import static org.junit.Assert.assertEquals;

public class DataBundlesTest {
    @Test
    public void dataBundlesTest() {
        PhoneBill bill = new PhoneBill();
        DataBundle data = new DataBundle(0.75);
        bill.accept(data);
        bill.accept(data);
        bill.accept(data);
        assertEquals(2.25, bill.totalCost(), 0.1);
    }
}
