package cz.muni.fi.pa165.currency;

import javax.inject.Named;
import javax.inject.Singleton;
import java.math.BigDecimal;
import java.util.Currency;

@Named
@Singleton
public class ExchangeRateTableImpl implements ExchangeRateTable {
    @Override
    public BigDecimal getExchangeRate(Currency sourceCurrency, Currency targetCurrency) throws ExternalServiceFailureException {
        return sourceCurrency.equals(Currency.getInstance("EUR")) && targetCurrency.equals(Currency.getInstance("CZK")) ? new BigDecimal("27") : null;
    }
}

