package com.currencyconverter.calculos;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ConversionHistoric {
    private String fileName = "Conversion-Historic.txt";
    
    public void saveFileHistoricConversion(String dataToSave){
        String data = dataToSave;

        try {
            FileWriter fw = new FileWriter(fileName, true);
            fw.write(data + "\n");
            fw.close();
        } catch (Exception e) {
            System.out.println("Error al guardar en el archivo: " + e.getMessage());
        }
    }

    public void readFileHistoricConversion(){
        try {
            List<String> listHistoric = Files.readAllLines(Paths.get(fileName));
            
            for(String list: listHistoric){
                System.out.println(list);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
