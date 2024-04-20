package com.currencyconverter.opciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.nio.Buffer;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Menu {
    private String[][] currencyOptions = {
        {"ARS", "Peso Argentino"}, 
        {"BOB", "Peso Boliviano"}, 
        {"BRL", "Real Brasileño"}, 
        {"CLP", "Peso Chileno"}, 
        {"COP", "Peso Colombiano"}, 
        {"USD", "Dolar Americano"}
    };

    private int menuId;
    private String currencyCode;
    private String currencyName;
    
    public Menu(int menuId, String currencyCode, String currencyName) {
        this.menuId = menuId;
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
    }

    public Menu(){}

    public void headerMenu(){
        System.out.println("******************************");
        System.out.println("Convertidor de Divisas");
        System.out.println("Selecciona una opcion del menu");
        System.out.println("******************************\n");
    }

    public void optionHeader(){
        System.out.println("******************************");
        System.out.println("1 => Convertir Divisa");
        System.out.println("2 => Historial de Conversiones");
        System.out.println("3 => Salir");
        System.out.println("******************************");
    }

    public void optionMenu(){
        System.out.println("******************************");
        
        for (int i = 0; i < currencyOptions.length; i++) {
            System.out.println(i + 1 + " => " + currencyOptions[i][0] + " - " + currencyOptions[i][1]);
        }
        
        System.out.println("******************************\n");
    }

    public String getCurrencyCodeByNumberOption(int currencyCode){
        return currencyOptions[currencyCode-1][0];
    }

    public int getLengthOptions(){
        return currencyOptions.length;
    }
}
