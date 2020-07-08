package phone.databundles;

import phone.BillAction;

public class DataBundle implements BillAction {
    private double dataCost;

    public DataBundle(double megabytes) {
        if (megabytes < 500) {
            this.dataCost = megabytes * 0.75;
        }
        if (megabytes >= 500) {
            this.dataCost = megabytes * 0.55;
        }
        if (megabytes > 1000) {
            this.dataCost = megabytes * 0.35;
        }
    }

    @Override
    public double totalCost() {
        return dataCost;
    }
}
