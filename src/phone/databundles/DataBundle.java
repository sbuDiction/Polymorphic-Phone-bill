package phone.databundles;

import phone.PhoneBill;

public class DataBundle extends PhoneBill {
    public double dataCost;

    public DataBundle(double megabytes) {
        this.dataCost = megabytes;
    }

}
