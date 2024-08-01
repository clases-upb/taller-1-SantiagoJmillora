/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {


    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
    public static String Convertir_km_seg (int km_seg) {
        try{
            float metro_seg = 0;
            float metro_hora = 0;
            final int constante_conversion_metro_segundo = 1000; 
            final int constante_conversion_metro_hora = 3600000;

            metro_seg = km_seg * constante_conversion_metro_segundo;
            metro_hora = km_seg * constante_conversion_metro_hora;

            return(metro_seg + " m/s - " + metro_hora + " m/h");
        }
        catch(Exception Error) {
            return("Error en la conversion");
        }
    }
    

    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
    public static float Convertir_cm_lt (double cm_cubicos) {
        try{
            float equivalente_litros_cm_cubicos = 0;
            final short constante_litro_cm_cubicos = 1000; 
            equivalente_litros_cm_cubicos = (float)cm_cubicos / constante_litro_cm_cubicos;
            return equivalente_litros_cm_cubicos;
        }
        catch(Exception e){
            return 0;
        }
    }
    

  
   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
   public static int Convertir_us_cops (int dolares) {
        try {
            int dolar_a_peso = 0;
            final short TRM = 4170;

            dolar_a_peso = dolares * TRM;

            return dolar_a_peso;
        } catch (Exception e) {
            return -1;
        }
   }
    
  
   
   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */
   public static double Convertir_cent_far(double celsius) {
    try {
        double fahrenheit = 0;
        final byte treinta_dos = 32;
        final byte nueve = 9;
        final byte cinco = 5;

        fahrenheit = treinta_dos + (nueve * celsius/cinco);

        return fahrenheit;
    } 
    catch (Exception r) {
        return 0;
    }

   }
          

   
   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */
   public static int Calcular_segs(short dias, short horas, short minutos, short segundos){
    try{
        //Declaracion de constantes 
        final int segundosxdia = 86400;
        final short segundosxhora = 3600;
        final byte segundosxminutos = 60; 

        //Calculos conversion a segundos
        int segundos_dia_total = dias * segundosxdia;
        int segundos_hora_total = horas * segundosxhora;
        int segundos_minutos_total = minutos * segundosxminutos;

        //Declaracion de variable a retornar 
        int segundos_totales = 0;
        segundos_totales = segundos_dia_total + segundos_hora_total + segundos_minutos_total + (int)segundos;
        return segundos_totales;

    }
    catch (Exception g){
        return -1;
    }
   }
   

   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/
   public static String Calcular_peso_carga(float camion_cargado_toneladas, float camion_vacio_toneladas) {
    try {
        
        float peso_netoTON = 0;
        peso_netoTON = camion_cargado_toneladas - camion_vacio_toneladas;
        
        float peso_netoKG = peso_netoTON * 1000;

        // Formatear la salida
        return (peso_netoKG + " kilos - " + peso_netoTON + " toneladas");
    } catch (Exception e) {
        return "Error en la función Calcular_peso_carga";
    }
   }
   

   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */
   public static float Calcular_horasxviaje(String destino, short distancia_km, short velocidad_promedio){
    try {
        float tiempo = 0;

        tiempo = distancia_km / velocidad_promedio;
        //calculo distancia velocidad promedio

        return tiempo;
    } catch (Exception e) {
        return -1;
    }
   }
  
   
   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/
   public static float Calcular_combustible(int ruta1, int ruta2, int ruta3, int ruta4){
    try {
        //cada 0.2 toneladas puede recorrer 60.8km en vel crucero
        //En el despegue consume 1.2 y en el aterrizaje consume 0.4, o sea que por viaje 1.6 ton combustible
        //Si por ejemplo la ruta es 60 consumiria 1.6 + .2 = 1.8

        //Declaracion de variables 
        float combustible_necesario = 0;
        final float combustible_obligatorio = 0.2f, despegue_aterrizaje = 1.6f, km_vel_crucero = 60.8f; 

        //operacion matematica
        combustible_necesario = (((combustible_obligatorio * ruta1)/km_vel_crucero) + despegue_aterrizaje) + (((combustible_obligatorio * ruta2)/km_vel_crucero) + despegue_aterrizaje) + (((combustible_obligatorio * ruta3)/km_vel_crucero) + despegue_aterrizaje) + (((combustible_obligatorio * ruta4)/km_vel_crucero) + despegue_aterrizaje);

        return combustible_necesario;
    } catch (Exception e) {
        return -1;
    }
   }
   
   
   
   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
   public static double Calcular_peso_luna(byte peso_kilos){
    try {
        //Declaracion de variables
        double peso_luna_new = 0, peso_tierra_new = 0;
        final double gravedad = 9.81, constante = 0.165;

        //Operaciones
        peso_tierra_new = peso_kilos * gravedad;
        peso_luna_new = peso_tierra_new * constante;

        return peso_luna_new;

    } catch (Exception e) {
        return 0;
    }
   }
   
   
}
