package mates;

import java.util.Random;

/**
 * La clase Matematicas proporciona métodos para operaciones matemáticas, incluida la generación
 * de aproximaciones al número pi mediante el método de Montecarlo.
 */
public class Matematicas {

    /**
     ** Genera una aproximación al número pi mediante el método de Montecarlo.
     * El parámetro `pasos` indica el número de puntos generados.
     *
     * @param pasos El número de puntos generados para la aproximación de pi.
     * @return Una aproximación al número pi calculada mediante el método de Montecarlo.
     */
    public static double generarNumeroPiIterativo(long pasos) {
        long dentroCirculo = 0;

        Random rand = new Random();

        for (long i = 0; i < pasos; i++) {
            double x = rand.nextDouble() * 2 - 1; // Punto aleatorio en el rango [-1, 1]
            double y = rand.nextDouble() * 2 - 1; // Punto aleatorio en el rango [-1, 1]

           
            if (x * x + y * y <= 1) {
                dentroCirculo++;
            }
        }

        
        double proporcion = (double) dentroCirculo / pasos;

        
        return 4.0 * proporcion;
    }
}
