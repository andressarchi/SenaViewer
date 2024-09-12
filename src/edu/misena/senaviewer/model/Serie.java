package edu.misena.senaviewer.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Serie extends Film {
    private int timeViewed;
    private int sessionQuantity;
    private static List<Serie> series = new ArrayList<>();

    public Serie(String title, String genre, String creator, int duration, int timeViewed, int sessionQuantity, int year) {
        super(title, genre, creator, duration);
        this.timeViewed = timeViewed;
        this.sessionQuantity = sessionQuantity;
        setYear(year); // Asegúrate de establecer el año usando el método heredado
    }

    // Getters y Setters
    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    public static void addSerie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el título de la serie:");
        String title = scanner.nextLine();

        System.out.println("Ingrese el género:");
        String genre = scanner.nextLine();

        System.out.println("Ingrese la duración:");
        int duration = scanner.nextInt();

        System.out.println("Ingrese el año (aaaa):");
        int year = scanner.nextInt();

        System.out.println("Ingrese el tiempo que ha tomado en verla:");
        int timeViewed = scanner.nextInt();

        System.out.println("¿En qué sesión vas?");
        int sessionQuantity = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea residual

        System.out.println("¿Ya la viste? (true/false)");
        boolean viewed = scanner.nextBoolean();
        scanner.nextLine(); // Consumir el salto de línea residual

        Serie newSerie = new Serie(title, genre, "Desconocido", duration, timeViewed, sessionQuantity, year);
        newSerie.setViewed(viewed);// Establecer el estado de vista

        System.out.println("Ingrese el Id:");
        int Id = scanner.nextInt();
        newSerie.setId(Id);

        System.out.println("¿la has visto?(true/false):");
        boolean visto = scanner.nextBoolean();
        scanner.nextLine(); // Consumir el salto de línea residual
        newSerie.setViewed(visto);
        series.add(newSerie);
        System.out.println("Serie agregada con éxito");
    }

    public static void verSeries() {
        if (series.isEmpty()) {
            System.out.println("No se han agregado series.\nDebes agregar una serie");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué atributo quieres ver?");
        System.out.println("1. Título");
        System.out.println("2. Género");
        System.out.println("3. Duración");
        System.out.println("4. Sesión");
        System.out.println("5. Vista");
        System.out.println("6. Tiempo en verla");
        System.out.println("7. Año");
        System.out.println("8. Ver todo");
        System.out.print("Ingrese su opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea residual

        System.out.println("\nDetalles de las series:");
        for (Serie serie : series) {
            switch (opcion) {
                case 1:
                    System.out.println("Título: " + serie.getTitle());
                    break;
                case 2:
                    System.out.println("Género: " + serie.getGenre());
                    break;
                case 3:
                    System.out.println("Duración: " + serie.getDuration());
                    break;
                case 4:
                    System.out.println("Sesión: " + serie.getSessionQuantity());
                    break;
                case 5:
                    System.out.println("Vista: " + serie.getViewed());
                    break;
                case 6:
                    System.out.println("Tiempo en verla: " + serie.getTimeViewed());
                    break;
                case 7:
                    System.out.println("Año: " + serie.getYear());
                    break;
                case 8:
                    System.out.println("Título: " + serie.getTitle());
                    System.out.println("Género: " + serie.getGenre());
                    System.out.println("Duración: " + serie.getDuration());
                    System.out.println("Sesión: " + serie.getSessionQuantity());
                    System.out.println("Vista: " + serie.getViewed());
                    System.out.println("Tiempo en verla: " + serie.getTimeViewed());
                    System.out.println("Año: " + serie.getYear());
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " Serie{" +
                "timeViewed=" + timeViewed +
                ", sessionQuantity=" + sessionQuantity +
                '}';
    }
}
