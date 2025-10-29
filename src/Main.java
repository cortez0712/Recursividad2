import ejercicios.EcuacionSumatoria;
import Bop.BobOperacionesAritmeticas;


public class Main
{

    public static void main(String[] args) {
        BobOperacionesAritmeticas bop = new  BobOperacionesAritmeticas(4,2);
        bop.mostrarResultados();

        EcuacionSumatoria.ecuacionSumatoria();
    }
}