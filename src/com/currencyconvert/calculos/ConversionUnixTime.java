package com.currencyconvert.calculos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversionUnixTime {
    public String getConvertedUnixTime(long unixTime){
        long toMilliseconds = unixTime * 1000;
        Date toDate = new Date(toMilliseconds);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        return sdf.format(toDate);
    }
}
