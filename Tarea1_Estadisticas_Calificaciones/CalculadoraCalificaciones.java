import java.util.Scanner;

public class CalculadoraCalificaciones {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double[] calificaciones;

        while (true) {

            calificaciones = leerCalificaciones();

            if (validarCalificaciones(calificaciones)) {
                break;
            }

            System.out.println("\nIntente nuevamente.\n");
        }

        mostrarReporte(calificaciones);
    }

    /**
     * Lee las 8 calificaciones
     */
    static double[] leerCalificaciones() {

        System.out.println("Ingrese 8 calificaciones separadas por comas:");
        System.out.print("Ejemplo: 85,92,78,88,95,75,82,90\n> ");

        String entrada = scanner.nextLine();

        String[] datos = entrada.split(",");

        if (datos.length != 8) {

            System.out.println("ERROR: Debe ingresar exactamente 8 calificaciones.");

            return new double[0];
        }

        double[] calificaciones = new double[8];

        try {

            for (int i = 0; i < datos.length; i++) {

                calificaciones[i] =
                        Double.parseDouble(datos[i].trim());
            }

        } catch (NumberFormatException e) {

            System.out.println("ERROR: Se detectó un valor no numérico.");

            return new double[0];
        }

        return calificaciones;
    }

    /**
     * Valida el rango de las calificaciones
     */
    static boolean validarCalificaciones(double[] calificaciones) {

        if (calificaciones.length != 8) {
            return false;
        }

        boolean valido = true;

        for (int i = 0; i < calificaciones.length; i++) {

            if (calificaciones[i] < 0 || calificaciones[i] > 100) {

                System.out.println("ERROR: La calificación "
                        + calificaciones[i]
                        + " está fuera del rango permitido (0-100).");

                valido = false;
            }
        }

        return valido;
    }

    /**
     * Calcula el promedio
     */
    static double calcularPromedio(double[] calificaciones) {

        double suma = 0;

        for (double nota : calificaciones) {
            suma += nota;
        }

        return suma / calificaciones.length;
    }

    /**
     * Encuentra la calificación máxima
     */
    static double encontrarMaximo(double[] calificaciones) {

        double maximo = calificaciones[0];

        for (double nota : calificaciones) {

            if (nota > maximo) {
                maximo = nota;
            }
        }

        return maximo;
    }

    /**
     * Encuentra la calificación mínima
     */
    static double encontrarMinimo(double[] calificaciones) {

        double minimo = calificaciones[0];

        for (double nota : calificaciones) {

            if (nota < minimo) {
                minimo = nota;
            }
        }

        return minimo;
    }

    /**
     * Cuenta los aprobados
     */
    static int contarAprobados(double[] calificaciones) {

        int aprobados = 0;

        for (double nota : calificaciones) {

            if (nota >= 70) {
                aprobados++;
            }
        }

        return aprobados;
    }

    /**
     * Muestra el reporte final
     */
    static void mostrarReporte(double[] calificaciones) {

        double promedio = calcularPromedio(calificaciones);

        double maximo = encontrarMaximo(calificaciones);

        double minimo = encontrarMinimo(calificaciones);

        int aprobados = contarAprobados(calificaciones);

        int reprobados = calificaciones.length - aprobados;

        double porcentaje =
                ((double) aprobados / calificaciones.length) * 100;

        System.out.println("\n--- REPORTE DE CALIFICACIONES ---");

        System.out.print("Calificaciones: ");

        for (int i = 0; i < calificaciones.length; i++) {

            System.out.print(calificaciones[i]);

            if (i < calificaciones.length - 1) {
                System.out.print(" - ");
            }
        }

        System.out.println("\n");

        System.out.printf("Promedio: %.2f%n", promedio);

        System.out.printf("Calificación máxima: %.2f%n", maximo);

        System.out.printf("Calificación mínima: %.2f%n", minimo);

        System.out.println("Cantidad de aprobados: " + aprobados);

        System.out.println("Cantidad de reprobados: " + reprobados);

        System.out.printf("Porcentaje de aprobados: %.1f%%%n",
                porcentaje);
    }
}