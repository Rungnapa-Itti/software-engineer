package th.ku.cashregisterannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class NYTaxCalculator {
    public double calculate(double amount) {
        if (amount <= 100) return 0;
        return amount*0.08;
    }

}
