package th.ku.cashregisterannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CashRegister {
    private double purchase;
    private String location;
    private TaxCalculator taxCal;

    @Autowired
    public CashRegister(String location, TaxCalculator taxCal) {
        this.location = location;
        this.taxCal = taxCal;
    }
    public void recordPurchase(double amount) {
        purchase += amount;
    }
    public double getTotal() {
        return purchase + taxCal.calculate(purchase);
    }

}
