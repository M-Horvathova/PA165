package cz.muni.fi.pa165.currency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("cz.muni.fi.pa165")
public class JavaConfig {

    @Bean
    public ExchangeRateTable exchangeRateTable() {
        return new ExchangeRateTableImpl();
    }

    // Task07 configuration, renamed due to clash with Named annotation for logging
    @Bean
    public CurrencyConvertorImpl currencyConvertor1() {
        return new CurrencyConvertorImpl(exchangeRateTable());
    }

   }
