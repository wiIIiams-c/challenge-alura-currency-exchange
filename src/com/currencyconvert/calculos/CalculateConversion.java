package com.currencyconvert.calculos;

import com.currencyconverter.models.Currency;

public class CalculateConversion {
    private long conversionResult;

    public void setConversionResult(Currency currency) {
        this.conversionResult = (long) (currency.getValueToConvert() * currency.getConversionRate());
        currency.setConversionResult(this.conversionResult);
    }
}
