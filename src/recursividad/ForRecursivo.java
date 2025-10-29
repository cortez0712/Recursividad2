package recursividad;

public class ForRecursivo {
    int inicio;
    double fin;

    double sumatoria = 0;

    public ForRecursivo(int inicio, double fin){
        this.inicio = inicio;
        this.fin = fin;
    }

    public void forRecursivo()
    {
        // Ecuacion
        double ecu1 = 2 * inicio + 1;

        // Al alcanzar el limite, retornamos la sumatoria
        if(inicio > fin){
            System.out.println("El resultado de la sumatoria es: " + sumatoria);
            return;
        }

        // Acumulador
        sumatoria += Math.pow(ecu1, (1/ecu1));
        // Aumentamos uno
        inicio++;

        // Llamamos esta misma funcion
        forRecursivo();
    }
}