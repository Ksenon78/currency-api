package com.example.currency;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CurrencyRepository extends JpaRepository<CurrencyRate, Long> {

}
