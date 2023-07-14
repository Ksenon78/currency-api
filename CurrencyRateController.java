package com.example.currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/currency-rates")
public class CurrencyRateController {

    private final CurrencyRateService currencyRateService;
    private static final String ISO_DATE_TIME = "2023-07-12";

    @Autowired
    public CurrencyRateController(CurrencyRateService currencyRateService) {
        this.currencyRateService = currencyRateService;
    }

    @GetMapping
    public List<CurrencyRate> getAllCurrencyRates() {

        return currencyRateService.getAllCurrencyRate();
    }

    @GetMapping("/filter")
    public List<CurrencyRate> filterCurrencyRates(
            @RequestParam(required = false) String source,
            @RequestParam(required = false) String currencyType,
            @RequestParam(required = false) @DateTimeFormat(pattern = ISO_DATE_TIME) LocalDateTime currencyDateTime
    ) {

        return currencyRateService.filterCurrencyRates(source, currencyType, currencyDateTime);
    }

    @Service
    private static class CurrencyRateService {
        public List<CurrencyRate> getAllCurrencyRate() {

            return null;
        }

        public List<CurrencyRate> filterCurrencyRates(String source, String currencyType, LocalDateTime currencyDateTime) {

            return null;
        }
    }
}
