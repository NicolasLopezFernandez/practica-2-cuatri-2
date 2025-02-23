package aplicacion;
import static mates.matematicas.generarNumeroPiRecursivo;

public class Principal {
    public static void main(String[] args) {
        System.out.println("El número PI es " +
                generarNumeroPiRecursivo(Integer.parseInt(args[0])));
    }
}
