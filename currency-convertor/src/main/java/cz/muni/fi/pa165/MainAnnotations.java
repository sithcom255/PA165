package cz.muni.fi.pa165;



import cz.muni.fi.pa165.currency.CurrencyConvertorImpl;
import cz.muni.fi.pa165.currency.ExchangeRateTableImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;


import java.math.BigDecimal;
import java.util.Currency;


public class MainAnnotations{
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(CurrencyConvertorImpl.class);
        applicationContext.register(ExchangeRateTableImpl.class);
        applicationContext.refresh();
        CurrencyConvertorImpl bean = applicationContext.getBean(CurrencyConvertorImpl.class);
        BigDecimal convert = bean.convert(Currency.getInstance("EUR"), Currency.getInstance("CZK"), new BigDecimal("1"));
        System.out.println(convert);
    }

}
