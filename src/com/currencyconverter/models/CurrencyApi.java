package com.currencyconverter.models;

public record CurrencyApi(
    long time_last_update_unix,
    String base_code,
    String target_code,
    double conversion_rate
) {

}