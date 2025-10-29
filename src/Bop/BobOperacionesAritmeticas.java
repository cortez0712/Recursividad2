package Bop;

public class BobOperacionesAritmeticas {
    private double num1;
    private double num2;

    public BobOperacionesAritmeticas(double n1, double n2){
        num1 = n1;
        num2 = n2;
    }
    public double sumar(){
        return num1 + num2;
    }
    public double restar(){
        return num1 - num2;
    }
    public double multiplicar(){
        return num1 * num2;
    }
    public double dividir(){
        if (num2 == 0){

            return 0;
        }
        return num1 / num2;
    }

    public void mostrarResultados(){
        System.out.println("********* Operaciones Aritméticas *********");
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        System.out.println("-------------------------------------------");
        System.out.println("Suma:            " + sumar());
        System.out.println("Resta:           " + restar());
        System.out.println("Multiplicación:  " + multiplicar());

        if (num2 == 0) {
            System.out.println("División:        No se puede dividir entre 0");
        } else {
            System.out.println("División:        " + dividir());
        }

        System.out.println("*******************************************");
    }
}

