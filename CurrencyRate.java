package com.example.currency;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

@Entity
@Table(name = "currency_rates")
public class CurrencyRate {



    @Autowired
    private CurrencyRepository currencyRateRepository;


    public void someMethod() {



        Map<String, Double> firstApiRates = getFirstApiRates();
        Map<String, Double> secondApiRates = getSecondApiRates();


        processAndSaveCurrencyRates(firstApiRates, "https://github.com/tayfunulu/DovizKurlari", LocalDateTime.now());
        processAndSaveCurrencyRates(secondApiRates, "https://fixer.io/", LocalDateTime.now());
    }

    private Map<String, Double> getFirstApiRates() {


        return null;
    }

    private Map<String, Double> getSecondApiRates() {

        return null;
    }

    private void processAndSaveCurrencyRates(Map<String, Double> rates, String currencySource, LocalDateTime dateTime) {

        for (Map.Entry<String, Double> entry : rates.entrySet()) {
            String currencyType = entry.getKey();
            BigDecimal rate = BigDecimal.valueOf(entry.getValue());


            CurrencyRate currencyRate = new CurrencyRate();
            currencyRate.setCurrencySource(currencySource);
            currencyRate.setCurrencyDateTime(dateTime);
            currencyRate.setCurrencyType(currencyType);
            currencyRate.setPurchasePrice(rate);
            currencyRate.setSellingPrice(rate);


            currencyRateRepository.save(currencyRate);
        }
    }





    public void setSellingPrice(BigDecimal rate) {
    }

    public void setCurrencyType(String currencyType) {
    }

    public void setPurchasePrice(BigDecimal rate) {
    }

    public void setCurrencySource(String currencySource) {
    }

    public void setCurrencyDateTime(LocalDateTime dateTime) {
    }

   
}
