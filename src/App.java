import java.util.Scanner;

import com.currencyconverter.calculos.CalculateConversion;
import com.currencyconverter.calculos.ConversionHistoric;
import com.currencyconverter.models.Currency;
import com.currencyconverter.opciones.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputUser = new Scanner(System.in);
        Menu menu = new Menu();
        menu.headerMenu();
        int inputOption = 0;
        
        while (inputOption != 3) {
            menu.optionHeader();

            try {
                ConversionHistoric conversionHistoric = new ConversionHistoric();
                System.out.println("\nDigite la opcion deseada:");
                inputOption = inputUser.nextInt();
                
                if(inputOption == 1){
                    menu.optionMenu();
                    
                    System.out.println("Digita la opcion de la divisa de origen:");    
                    int inputCurrency = inputUser.nextInt();
                    var inCurrency = menu.getCurrencyCodeByNumberOption(inputCurrency);
            
                    System.out.println("\nDigita la opcion de la divisa a convertir:");
                    int outputCurrency = inputUser.nextInt();
                    var outCurrency = menu.getCurrencyCodeByNumberOption(outputCurrency);
    
                    System.out.println("\nEscriba el valor a convertir:");
                    Double inputValue = inputUser.nextDouble();
    
                    Currency currency = new Currency(inCurrency, outCurrency, inputValue);
                    CalculateConversion calculateConversion = new CalculateConversion();
    
                    calculateConversion.setConversionResult(currency);
                    conversionHistoric.saveFileHistoricConversion(currency.toString());
                    
                    System.out.println("\n******************************");
                    System.out.println("Informacion de conversion de divisa:\n");
                    System.out.println(currency.toString());
                    System.out.println("******************************\n");
                    
                }else if(inputOption == 2){
                    System.out.println("\n******************************");
                    System.out.println("Historial de Conversiones:\n");
                    conversionHistoric.readFileHistoricConversion();
                    System.out.println("******************************\n");
                }else if(inputOption == 3){
                    System.exit(0);
                }else{
                    System.out.println("\nOpcion digitada no esta listada en la lista\n");
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("\nOpcion digitada no esta listada en la lista");
            } catch (Exception e) {
                System.out.println("\n"+e.getMessage()+"\n");
            }
        }
    }
}
