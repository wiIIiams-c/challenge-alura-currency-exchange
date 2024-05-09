package com.currencyconverter.models;

import com.currencyconverter.api.ApiCurrency;
import com.currencyconverter.calculos.ConversionUnixTime;

public class Currency {
    private String currencyBase;
    private String currencyTarget;
    private double conversionRate;
    private double conversionResult;
    private double valueToConvert;
    private long conversionDate;
    private long conversionLastUpdate;
    
    public Currency(String currencyBase, String currencyTarget, double valueToConvert) {
        this.currencyBase = currencyBase;
        this.currencyTarget = currencyTarget;
        this.valueToConvert = valueToConvert;
        this.conversionDate = System.currentTimeMillis()/1000L;
        this.getConversionDataApi();
    }

    public void setConversionResult(double conversionResult) {
        this.conversionResult = conversionResult;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public double getValueToConvert() {
        return valueToConvert;
    }

    private void getConversionDataApi(){
        ApiCurrency apiCurrency = new ApiCurrency();
        CurrencyApi currencyApi = apiCurrency.transformCurrency(this.currencyBase, this.currencyTarget);
        
        this.conversionLastUpdate = currencyApi.time_last_update_unix();
        this.conversionRate = currencyApi.conversion_rate();
    }

    private String convertedDate(long unixTime){
        ConversionUnixTime convertUnixTime = new ConversionUnixTime();
        return convertUnixTime.getConvertedUnixTime(unixTime);
    }

    @Override
    public String toString(){
        return "Fecha Conversion: " + this.convertedDate(this.conversionDate) +
                " | Fecha Actualizacion Divisa: " + this.convertedDate(this.conversionLastUpdate) +
                " | Divisas Convertidas: " + this.currencyBase + " => " + this.currencyTarget +
                " | Rate de Conversion: " + this.conversionRate + " " + this.currencyTarget +
                " | Valor a Convertir: " + this.valueToConvert + " " + this.currencyBase +
                " | Resultado Conversion: " + this.conversionResult + " " + this.currencyTarget;
    }
}
