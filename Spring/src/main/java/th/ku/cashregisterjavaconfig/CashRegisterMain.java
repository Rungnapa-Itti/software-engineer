package th.ku.cashregisterjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CashRegisterMain {
    public static void main(String[] args) {
//        CATaxCalculator caTax = new CATaxCalculator();
//        CashRegister register = new CashRegister("CA", (TaxCalculator) caTax);

        //ให้ตรงกับ xml -> id กับ class นั้น

        ApplicationContext context =
                new AnnotationConfigApplicationContext(CashRegisterConfig.class);
        CashRegister register = context.getBean(CashRegister.class);

        register.recordPurchase(100);
        register.recordPurchase(50);
        System.out.println(register.getTotal());




    }
}



