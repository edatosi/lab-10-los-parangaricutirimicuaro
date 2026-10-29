package co.umariana.equipo;

import java.util.ArrayList;
import java.util.List;

/**
 * LA TARJETA DE CADA INTEGRANTE SE AGREGA EN ESTE ARCHIVO (el mismo para todo el equipo).
 *
 * Agregue UNA línea con su tarjeta, justo debajo del comentario ">>> AGREGUE ...".
 * Los datos son: su usuario de GitHub, su nombre, un mensaje corto (máximo 80 caracteres)
 * y un color (por ejemplo #EF476F, #118AB2, #06D6A0, #FFD166).
 *
 * Si dos compañeros agregan su línea en el mismo lugar, Git avisará de un conflicto al unir
 * los Pull Requests: cómo resolverlo se explica en clase.
 */
public final class Integrantes {

    /** Título que muestra la ventana (no es necesario cambiarlos). */
    public static final String NOMBRE_EQUIPO = "Los Parangaricutirimicuaro";
    public static final String LEMA = "parangaricutirimicuaro los mejores raperos del mundo";

    private Integrantes() {
    }

    public static List<Tarjeta> tarjetas() {
        List<Tarjeta> lista = new ArrayList<>();

        lista.add(new Tarjeta("camilopuerres0-code", "Andres Camilo", "Bienvenidos, hoy es un dia muy maraviiloso para todas las personas de este mundo", "#ed0909"));
        // >>> AGREGUE SU TARJETA DEBAJO DE ESTA LÍNEA <<<

        return lista;
    }
}
