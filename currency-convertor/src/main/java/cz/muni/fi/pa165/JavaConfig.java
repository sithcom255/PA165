package cz.muni.fi.pa165;

import cz.muni.fi.pa165.currency.CurrencyConvertorImpl;
import cz.muni.fi.pa165.currency.ExchangeRateTableImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.math.BigDecimal;

@EnableAspectJAutoProxy
@Configuration
public class JavaConfig {
//    @Bean
//    public Profiler profiler(){
//        return new Profiler();
//    }


    @Bean
    public ExchangeRateTableImpl exchangeRateTableImp(){
        return new ExchangeRateTableImpl();
    }


    @Bean
    public CurrencyConvertorImpl currencyConvertorImpl(){
        return new CurrencyConvertorImpl(exchangeRateTableImp());
    }



}
