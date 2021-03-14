package cz.muni.fi.pa165;

import cz.muni.fi.pa165.currency.CurrencyConvertor;
import cz.muni.fi.pa165.currency.CurrencyConvertorImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.Currency;

public class MainXml {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring-config.xml");
        CurrencyConvertorImpl currencyConvertor = context.getBean("currencyConvertor", CurrencyConvertorImpl.class);
        BigDecimal convert = currencyConvertor.convert(Currency.getInstance("EUR"), Currency.getInstance("CZK"), new BigDecimal("1"));
        System.out.println(convert);
    }


}
