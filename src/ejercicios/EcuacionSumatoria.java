package ejercicios;

import recursividad.ForRecursivo;

import java.util.Scanner;

public class EcuacionSumatoria {
    public static void ecuacionSumatoria()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        ForRecursivo fr = new ForRecursivo(numero, 10);

        fr.forRecursivo();
    }
}