package com.currencyconvert.calculos;

import com.currencyconverter.models.Currency;

public class CalculateConversion {
    private double conversionResult;

    public void setConversionResult(Currency currency) {
        this.conversionResult = currency.getValueToConvert() * currency.getConversionRate();
        currency.setConversionResult(this.conversionResult);
    }
}
