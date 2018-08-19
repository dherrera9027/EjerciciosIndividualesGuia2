/* programa para calcular partir del número de personas que caben en el colectivo y el número de turistas que van al hotel.
 * cuántos viajes debe realizar el colectivo
 * cuánto dinero en total deberán pagar los turistas al colectivo
 * cuánto dinero deberá pagar el conductor al propietario.
 */ 
import java.util.Scanner;   
public class Ejercicio3
{
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        
        double pasajeros;
        double valorPasaje;
        double valorViaje;
        double valorTotal;
        double pagoEmpresa;
        double viajes;
        
        valorPasaje = 10000;
        valorViaje = 2000;
               
        System.out.println("En el colectivo caben 10 pasajeros y el valor del pasaje por persona es de $10.000 pesos");
        System.out.println("Cuantos pasajeros necesita transportar");
        
            pasajeros = entrada.nextInt();
            valorTotal = pasajeros * valorPasaje;
            viajes = Math.ceil(pasajeros/10);
            pagoEmpresa = viajes * 2000;
            
        System.out.println("El valor total es de $"+valorTotal+" pesos");
        
        if(pasajeros <= 10)
        {
            System.out.println("El conductor debe hacer 1 viaje");
            System.out.println("El conductor debe pagar a la empresa $2.000 pesos");
        }else
        if(pasajeros >= 11)
        {
            System.out.println("El conductor debe hacer " +viajes+ " viajes");
            System.out.println("El conductor debe pagar a la empresa " +pagoEmpresa+ " pesos");
        }
    }
}
