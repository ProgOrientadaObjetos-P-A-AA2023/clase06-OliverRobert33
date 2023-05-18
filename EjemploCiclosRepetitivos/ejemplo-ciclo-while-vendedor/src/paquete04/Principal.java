package paquete04;

import paquete02.Vendedor;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // variables para ingreso de datos
        String nombre;
        int edad;
        double sMinino;
        int autos;
       
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal;
        // Inicio de proceso iterativo 
       
        cadenaFinal = ""; // inicializo la variable que contendrá la cadena
        // final.
        for (int i = 0; i < 3; i++) {
            System.out.println("Trabajador: " + (i+1));
            System.out.println("Ingrese el nombre del vendedor");
            nombre = entrada.nextLine();
            System.out.println("Ingrese edad del vendedor");
            edad = entrada.nextInt();
            System.out.println("Ingrese el salario mínimo");
            sMinino = entrada.nextDouble();
            System.out.println("Ingrese el número de autos vendidos");
            autos = entrada.nextInt();

            // con los datos ingresados se crea el objeto de tipo Vendedor
            Vendedor v = new Vendedor(nombre, edad, sMinino,
                    autos);
            v.calcularPagoMensual();
            cadenaFinal = String.format("%sDatos de Vendedor\n"
                    + "Nombre: %s\n"
                    + "Edad: %s\n"
                    + "Salario mínimo: %.2f\n"
                    + "Número de autos: %d\n"
                    + "Pago mensual: %.2f\n\n",
                    cadenaFinal,
                    v.obtenerNombres(), v.obtenerEdad(),
                    v.obtenerSalarioMinimo(), v.obtenerNumeroAutos(),
                    v.obtenerPagoMensual());

            entrada.nextLine(); // limpieza del buffer
        }
                
        System.out.println("--------------------------------------");

        System.out.println(cadenaFinal);

    }
}
