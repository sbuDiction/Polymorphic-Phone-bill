package phone.databundles;

import org.junit.Test;
import phone.PhoneBill;
import phone.calls.PhoneCall;

import static org.junit.Assert.assertEquals;

public class DataBundlesTest {
    @Test
    public void ShouldAcceptDataBundleBillActionAndReturnTotal() {
        PhoneBill phoneBill = new PhoneBill();
        DataBundle dataBundle = new DataBundle(500);
        phoneBill.accept(dataBundle);
        phoneBill.totalCost();
        assertEquals(500, phoneBill.totalCost(), 0.01);

    }
}
