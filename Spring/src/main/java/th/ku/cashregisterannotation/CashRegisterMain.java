package th.ku.cashregisterannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CashRegisterMain {
    public static void main(String[] args) {
//        CATaxCalculator caTax = new CATaxCalculator();
//        CashRegister register = new CashRegister("CA", (TaxCalculator) caTax);

        //ให้ตรงกับ xml -> id กับ class นั้น

        ApplicationContext context =
                new ClassPathXmlApplicationContext("config-annotation.xml");
        CashRegister register = context.getBean("register", CashRegister.class);

        register.recordPurchase(100);
        register.recordPurchase(50);
        System.out.println(register.getTotal());




    }
}



