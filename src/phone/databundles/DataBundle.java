package phone.databundles;

import phone.BillAction;

public class DataBundle implements BillAction {
    private double dataCost;

    public DataBundle(double megabytes) {
        this.dataCost = megabytes;
    }

    @Override
    public double totalCost() {
        return dataCost;
    }
}
