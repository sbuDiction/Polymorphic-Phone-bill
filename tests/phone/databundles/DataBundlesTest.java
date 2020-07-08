package phone.databundles;

import org.junit.Test;
import phone.PhoneBill;

import static org.junit.Assert.assertEquals;

public class DataBundlesTest {
    @Test
    public void totalCostHigher() {
        assertEquals(358.4, new DataBundle(1024).totalCost(), 0.01);
    }

    @Test
    public void totalCostMedium() {
        assertEquals(275, new DataBundle(500).totalCost(), 0.01);
    }

    @Test
    public void totalCostBasic() {
        assertEquals(96, new DataBundle(128).totalCost(), 0.01);
    }

    @Test
    public void totalCostOne() {
        assertEquals(358.4, new DataBundle(1024).totalCost(), 0.01);
    }

    @Test
    public void totalCost() {
        assertEquals(0.75, new DataBundle(1).totalCost(), 0.01);
    }

    @Test
    public void totalCostZero() {
        assertEquals(0, new DataBundle(0).totalCost(), 0.01);
    }

    @Test
    public void totalCostBelowZero() {
        assertEquals(-151.5, new DataBundle(-202).totalCost(), 0.01);
    }
}
