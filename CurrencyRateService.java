package com.example.currency;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
class CurrencyRateService {

    private final RestTemplate restTemplate;
    private final CurrencyRepositoryImpl currencyRateRepository;

    @Autowired
    public CurrencyRateService(RestTemplate restTemplate, CurrencyRepositoryImpl currencyRateRepository) {
        this.restTemplate = restTemplate;
        this.currencyRateRepository = currencyRateRepository;
    }

    public List<CurrencyRate> getAllCurrencyRate() {

        return null;
    }

    public List<CurrencyRate> filterCurrencyRates(String source, String currencyType, LocalDateTime currencyDateTime) {

        return null;
    }

    public Map<String, Double> getExchangeRatesFromAPI1() {
        String apiKey1 = "58e497362e7ef4cfa1a2e57ab7e92434\n";
        String apiUrl1 = "http://data.fixer.io/api/latest" + apiKey1;

        ResponseEntity<CurrencyResponse> response = (ResponseEntity<CurrencyResponse>) restTemplate.getForEntity(apiUrl1, CurrencyResponse.class);

        if (response.getStatusCode() == HttpStatus.OK) {
            CurrencyResponse currencyResponse = response.getBody();
            if (currencyResponse != null) {
                return currencyResponse.getRates();
            }
        }

        return null;
    }

    public Map<String, Double> getExchangeRatesFromAPI2() {
        String apiKey2 = "eaa4b7eb2120914faa950bfbf3438c4b";
        String apiUrl2 = "\"https://api.currencylayer.com/live" + apiKey2;
                ;

        org.springframework.http.ResponseEntity<CurrencyResponse> response = restTemplate.getForEntity(apiUrl2, CurrencyResponse.class);

        if (response.getStatusCode() == HttpStatus.OK) {
            CurrencyResponse currencyResponse = response.getBody();
            if (currencyResponse != null) {
                return currencyResponse.getRates();
            }
        }

        return null;
    }

    public void fetchAndSaveCurrencyRates() {

        Map<String, Double> apiRates1 = getExchangeRatesFromAPI1();
        Map<String, Double> apiRates2 = getExchangeRatesFromAPI2();


        processAndSaveCurrencyRates(apiRates1, "API1", LocalDateTime.now());
        processAndSaveCurrencyRates(apiRates2, "API2", LocalDateTime.now());
    }

    private void processAndSaveCurrencyRates(Map<String, Double> rates, String source, LocalDateTime dateTime) {
        if (rates != null) {
            for (Map.Entry<String, Double> entry : rates.entrySet()) {
                String currencyType = entry.getKey();
                Double rate = entry.getValue();


                CurrencyRate currencyRate = new CurrencyRate();
                currencyRate.setCurrencySource(source);
                currencyRate.setCurrencyDateTime(dateTime);
                currencyRate.setCurrencyType(currencyType);
                currencyRate.setPurchasePrice(BigDecimal.valueOf(rate));
                currencyRate.setSellingPrice(BigDecimal.valueOf(rate));


                currencyRateRepository.save(currencyRate);
            }
        }
    }
}
