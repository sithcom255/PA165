package cz.muni.fi.pa165;

import cz.muni.fi.pa165.currency.CurrencyConvertorImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.Currency;

public class MainJavaConfig {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        CurrencyConvertorImpl currencyConvertorImpl = applicationContext.getBean("currencyConvertorImpl", CurrencyConvertorImpl.class);
        BigDecimal convert = currencyConvertorImpl.convert(Currency.getInstance("EUR"), Currency.getInstance("CZK"), new BigDecimal("1"));
        System.out.println(convert);
    }
}
