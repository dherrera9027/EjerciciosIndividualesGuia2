import java.util.Scanner;
public class Ejercicio4
{
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        
        double precioBruto;
        double camioneta;
        double precioNeto;
        double automovil;
        int opcion;
        double impuesto;
        
        System.out.println("Seleccione el tipo de vehiculo");
        System.out.println("1) Camioneta");
        System.out.println("2) Automovil");
            
        opcion = entrada.nextInt();
        
        switch (opcion){
            case 1:
            System.out.println("Indique el precio que esta dispuesto a pagar");
            precioBruto = entrada.nextDouble();
            camioneta = Math.ceil(precioBruto*50/100);
            precioNeto = precioBruto + camioneta;
            if(precioBruto <= 79){
                System.out.println("No debe pagar impuestos por el vehiculo");
                System.out.println("El precio del vehiculo quedaria en $" +precioBruto);
            }else
            if(precioBruto >= 80){
                System.out.println("El impuesto que debe pagar es de $"+camioneta);
                System.out.println("El precio del vehiculo quedaria en $" +precioNeto);
            } 
            break;  
            
            case 2:
            System.out.println("Indique el precio que esta dispuesto a pagar");
            precioBruto = entrada.nextDouble();
            
            if(precioBruto <= 19){
                System.out.println("El impuesto que debe pagar es de $5");
                System.out.println("El precio del vehiculo quedaria en $" +(precioBruto + 5));
            }else
            if(precioBruto >= 20 && precioBruto <= 40){
               impuesto = precioBruto / 5;
               System.out.println("El impuesto que debe pagar es de $"+impuesto);
               System.out.println("El precio del vehiculo quedaria en $" +(precioBruto + impuesto));
            }
            else if(precioBruto > 40){
                System.out.println("El impuesto que debe pagar es de $9");
                System.out.println("El precio del vehiculo quedaria en $" +(precioBruto + 9));
            }
            break;
        }// fin switch
    }// fin metodo main
}// fin clase
