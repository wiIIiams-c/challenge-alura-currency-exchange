package com.currencyconverter.api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.currencyconverter.models.CurrencyApi;
import com.google.gson.Gson;

public class ApiCurrency {
    public CurrencyApi transformCurrency(String inputCurrency, String outputCurrency){
        String apiKey = "AQUI_TU_API_KEY";
        URI apiUrl = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + inputCurrency + "/" + outputCurrency);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(apiUrl).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() == 200){
                return new Gson().fromJson(response.body(), CurrencyApi.class);
            }else{
                throw new RuntimeException("Se ha cancelado la solicitud, revise su configuracion de API");
            }
        } catch (Exception e) {
            throw new RuntimeException("Ha ocurrido un error en la conexion con la API, referencia: " + e.getMessage());
        }
    }
}
