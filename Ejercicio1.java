//programa que realice la conversión de unidades de medida a pulgadas
import java.util.Scanner;
public class Ejercicio1
{
    public static void main ( String[] args )
    {
        Scanner entrada = new Scanner (System.in);
        
        int opcion;
        double pulgada, pies, centimetros,legua, yarda;
        // 1 pulgada equivale: pies = 0.0833; centimetros = 2.54; legua = 190080.02; yarda = 36;
        
        System.out.println("Realice la conversion de unidades de medida a pulgadas");
        System.out.println("Que desea convertir");
        System.out.println("1) Pies a pulgadas");
        System.out.println("2) Centimetros a Pulgadas");
        System.out.println("3) Legua a Pulgadas");
        System.out.println("4) Yarda a Pulgadas");
        System.out.println("Seleccione una opcion");
            
        opcion = entrada.nextInt();
       
        switch(opcion){
           case 1: 
           System.out.println("Ingrese la cantidad de pies que desea convertir");
           pies = entrada.nextDouble();
           pulgada = pies / 0.0833;
           System.out.println(pies+" Pies equivalen a "+pulgada+" pulgadas");
           break;
           
           case 2: 
           System.out.println("Ingrese la cantidad de Centimetros que desea convertir");
           centimetros = entrada.nextDouble();
           pulgada = centimetros / 2.54;
           System.out.println(centimetros+" Centimetros equivalen a "+pulgada+" pulgadas");
           break;
           
           case 3: 
           System.out.println("Ingrese la cantidad de leguas que desea convertir");
           legua = entrada.nextDouble();
           pulgada = legua / 190080.02;
           System.out.println(legua+" Leguas equivalen a "+pulgada+" pulgadas");
           break;
           
           case 4: 
           System.out.println("Ingrese la cantidad de yardas que desea convertir");
           yarda = entrada.nextDouble();
           pulgada = yarda / 36;
           System.out.println(yarda+" yardas equivalen a "+pulgada+" pulgadas");
           break;
        }
   }// fin del metodo main
}// fin de la clase
