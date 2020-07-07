package phone;

public class PhoneBill implements BillAction {
    private double total;

    public void accept(BillAction billAction) {
        total += billAction.totalCost();
    }

    @Override
    public double totalCost() {
        return total;
    }
}
