package cz.muni.fi.pa165.currency;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import javax.inject.Named;
import java.math.BigDecimal;
import java.util.Currency;


@Named
public class MainJavaConfig {

   public static void run() {
       ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
       CurrencyConvertor cur = context.getBean("currencyConvertorImpl" ,CurrencyConvertor.class);
       System.out.println(cur.convert(Currency.getInstance("EUR"), Currency.getInstance("CZK"), BigDecimal.ONE));

   }

    public static void main(String[] args) {
        run();
    }
}
