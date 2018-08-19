// halle el área de sombreada entre el cuadrado y el circulo
import java.util.Scanner;
public class Ejercicio2
{ 
    public static void main (String[] args)
    {
      Scanner entrada = new Scanner (System.in);
      
      System.out.println("Programa para hallar el área vacia entre un circulo y un cuadrado en su interior");
      System.out.println("__________________________________________");
      System.out.println("Primero debemos hallar el area del circulo");
      System.out.println("______________________________");
      System.out.println("Introduce el radio del circulo");
      
      double radio, areaCirculo;
      
      radio = entrada.nextDouble();
      areaCirculo = radio * radio * 3.14159;
      
      System.out.println("El area del circulo es "+ areaCirculo);
      System.out.println("_________________________________________________________________");
      System.out.println("Ahora debemos hallar el area del cuadrado al interior del circulo");
      System.out.println("_______________________________________________________________________________");
      System.out.println("El radio del circulo " + radio + " corresponde a la mitad diagonal del cuadrado");
      System.out.println("_________________________________________________________________________________________________");
      System.out.println("Si unimos el centro del circulo a cada punta del cuadrado dividiremos el cuadrado en 4 triangulos");
      System.out.println("_________________________________________________________________________________________________");
      System.out.println("Cada triangulo tendra en su base y su altura el equivalente al tamaño del radio del circulo");
      System.out.println("Que para este caso es igual a "+ radio);
      
      double base,altura, areaTriangulo;
      
      base = radio;
      altura = radio;
      areaTriangulo = base * altura / 2;
      
      System.out.println("_______________________________________________________________________________");
      System.out.println("Entonces el area de cada triangulo al interior del cuadrado es de " + areaTriangulo);
      
      double areaCuadrado;
      
      areaCuadrado = areaTriangulo * 4;
      
      System.out.println("______________________________________________________________________________________________________");
      System.out.println("Y asi obtendremos el area del cuadrado " +areaCuadrado+ " que equivale el area del triangulo multiplicada por 4");
      System.out.println("_____________________________________________________________________________________________________________");
      System.out.println("Ahora ya tenemos los datos necesarios para hallar el area vacia entre el circulo y el cuadrado en su interior");
      System.out.println("Los datos son");
      System.out.println("El area del circulo = "+areaCirculo);
      System.out.println("El area del cuadrado = "+areaCuadrado);
      System.out.println("____________________________________________________________________________________________");
      System.out.println("Y la operación para obtener el area vacia es: el area del circulo menos el area del cuadrado");
      
      double areaVacia;
      areaVacia = areaCirculo - areaCuadrado;
      
      System.out.println("El area vacia es = "+areaVacia);
    }// fin metodo main
}// fin clase
