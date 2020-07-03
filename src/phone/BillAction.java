package phone;

public interface BillAction {
    double totalCost();

    void call(double cost);

    void sms(int qty, double cost);

    void data(double cost);
}
