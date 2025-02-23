package mates;
import java.util.Random;

public class matematicas {
    /**
     * * Genera una aproximación al número Pi mediante el método de
     * * Montecarlo. El parámetro `pasos` indica el número de puntos
     * * generado.Hola.
     */
    public static double generarNumeroPiRecursivo(long pasos) {
        return generarNumeroPiRecursivo(pasos,0);
    }
    private static double generarNumeroPiRecursivo(long pasos, long dentroCirculo) {

        if (pasos == 0) {
            return 4.0 * dentroCirculo / (dentroCirculo + pasos);
        } else {
            Random random = new Random();
            double x = random.nextDouble();
            double y = random.nextDouble();

            if (x * x + y * y <= 1) {
                dentroCirculo++;
            }
            return generarNumeroPiRecursivo(pasos - 1, dentroCirculo);
        }
    }
}
