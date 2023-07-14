package com.example.currency;

import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.function.Function;

@Repository
public class CurrencyRepositoryImpl implements CurrencyRepository {

    @Override
    public <S extends CurrencyRate> S save(S entity) {
        return null;
    }

    @Override
    public <S extends CurrencyRate> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CurrencyRate> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<CurrencyRate> findAll() {
        return null;
    }

    @Override
    public List<CurrencyRate> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(CurrencyRate entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends CurrencyRate> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<CurrencyRate> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<CurrencyRate> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CurrencyRate> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends CurrencyRate> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends CurrencyRate> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends CurrencyRate> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CurrencyRate> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends CurrencyRate> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends CurrencyRate, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends CurrencyRate> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends CurrencyRate> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<CurrencyRate> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CurrencyRate getOne(Long aLong) {
        return null;
    }

    @Override
    public CurrencyRate getById(Long aLong) {
        return null;
    }

    @Override
    public CurrencyRate getReferenceById(Long aLong) {
        return null;
    }
}
