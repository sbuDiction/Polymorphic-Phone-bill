package phone.databundles;

import phone.PhoneBill;

public class DataBundle extends PhoneBill {
    private double dataCost;

    public DataBundle(double megabytes) {
        this.dataCost = megabytes;
    }

    public double getDataCost() {
        return dataCost;
    }

}
