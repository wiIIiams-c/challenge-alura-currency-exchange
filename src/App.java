import java.util.Scanner;

import com.currencyconvert.calculos.CalculateConversion;
import com.currencyconvert.calculos.ConversionHistoric;
import com.currencyconverter.models.Currency;
import com.currencyconverter.opciones.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        menu.headerMenu();
        int inOption = 0;
        
        while (inOption != 3) {
            menu.optionHeader();

            ConversionHistoric conversionHistoric = new ConversionHistoric();
            System.out.println("\nEscriba la opcion deseada:");
            Scanner inputOption = new Scanner(System.in);
            inOption = Integer.valueOf(inputOption.nextLine());

            if(inOption == 1){
                menu.optionMenu();
                
                Scanner inputCurrency = new Scanner(System.in);
                System.out.println("Ingresa opcion de la divisa de origen:");
                var inCurrency = menu.getCurrencyCodeByNumberOption(Integer.valueOf(inputCurrency.nextLine()));
        
                Scanner outputCurrency = new Scanner(System.in);
                System.out.println("\nIngresa opcion de la divisa a convertir:");
                var outCurrency = menu.getCurrencyCodeByNumberOption(Integer.valueOf(outputCurrency.nextLine()));

                Scanner inputValue = new Scanner(System.in);
                System.out.println("\nEscriba el valor a convertir:");
                var inValue = Double.valueOf(inputValue.nextLine());

                Currency currency = new Currency(inCurrency, outCurrency, inValue);
                CalculateConversion calculateConversion = new CalculateConversion();

                calculateConversion.setConversionResult(currency);
                conversionHistoric.saveFileHistoricConversion(currency.toString());
                
                System.out.println("\n******************************");
                System.out.println("Informacion de conversion de divisa:\n");
                System.out.println(currency.toString());
                System.out.println("******************************\n");
                
            }else if(inOption == 2){
                System.out.println("\n******************************");
                System.out.println("Historial de Conversiones:\n");
                conversionHistoric.readFileHistoricConversion();
                System.out.println("******************************\n");
            }else if(inOption == 3){
                System.exit(0);
            }else{
                System.out.println("No es una opcion valida");
            }
        }
    }
}
