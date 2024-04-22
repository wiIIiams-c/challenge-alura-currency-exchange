# Conversor de Moneda - Challenge ONE - Java - Back end

Convertidor de divisas realizado para el primer desafio back end Java de alura
Este utiliza una API para realizar las conversiones de acuerdo al input que da el usuario.

## Pre requisitos

### Generar API Key
Primero que todo debes de tener una cuenta en [API Exchange](https://www.exchangerate-api.com) para que esta
aplicación funcione ya que dicha pagina te entregara una api key que deberas ingresar en la aplicación.

![alt text](https://storage.googleapis.com/media-github-readme/alura-06.png)

### Agregar API Key

La api key deberas agregarla en el archivo ApiCurrency.java reeplazando el texto que dice AQUI_TU_API_KEY, luego le das guardar al archivo y todo ok.

![alt text](https://storage.googleapis.com/media-github-readme/alura-05.png)

## Aplicación

Al ejecutar la aplicación esta te recibe con 3 opciones que se muestran a continuación, para cada menu solo debes ingresar el numero de opcion que deseas:

![alt text](https://storage.googleapis.com/media-github-readme/alura-01.png)

### Opción 1 - Convertir Divisa

Se te desplegara una lista con las divisas disponibles el programa te consultara primero el numero de opcion
de la divisa de origen, luego te consultara por la divisa a la que quieres convertir y para finalizar el valor a convertir.

![alt text](https://storage.googleapis.com/media-github-readme/alura-02.png)

Luego de haber ingresado el valor a convertir se te desplegara la informacion de la conversion que esta compuesta de:

    - Fecha Conversion
    - Fecha Actualizacion Divisa
    - Divisas Convertidas
    - Rate de Conversion
    - Valor a Convertir
    - Resultado Conversion

![alt text](https://storage.googleapis.com/media-github-readme/alura-03.png)

Dichos resultado se almacenara en un archivo txt como historial de conversion que posteriormete podra visualizar.

### Opción 2 - Historial de Conversion

Esta opcion podras viasualizar todas las conversiones realizadas con el detalle mencionado anteriormente.

![alt text](https://storage.googleapis.com/media-github-readme/alura-04.png)

## Agregar Divisas a Convertir

Si deseas agregar mas divisas a lista deberas ir a la clase Menu.java y agregarlas en el arreglo de nombre currencyOptions

![alt text](https://storage.googleapis.com/media-github-readme/alura-07.png)