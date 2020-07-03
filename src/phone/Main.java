package phone;

import phone.calls.PhoneCall;
import phone.databundles.DataBundle;
import phone.smss.SMSBundle;

public class Main {
    public static void main(String[] args) {
        PhoneBill bill = new PhoneBill();
        PhoneCall placeCall = new PhoneCall(1.50);
        SMSBundle sms = new SMSBundle(10,0.80);
        DataBundle dataBundles = new DataBundle(0.75);
        bill.accept(placeCall);
        System.out.println(bill.totalCost());
    }
}
