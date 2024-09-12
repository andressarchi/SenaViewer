package edu.misena.senaviewer.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movie extends Film {
    private static List<Movie> movies = new ArrayList<>();
    private int timeViewed;

    public Movie(String title, String genre, String creator, int duration, int timeViewed, int year) {
        super(title, genre, creator, duration);
        this.timeViewed = timeViewed;
        setYear(year); // Asegúrate de establecer el año usando el método heredado
    }

    // Getters y Setters
    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public static void addMovie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el título de la película:");
        String title = scanner.nextLine();

        System.out.println("Ingrese el género:");
        String genre = scanner.nextLine();

        System.out.println("Ingrese el creador:");
        String creator = scanner.nextLine();

        System.out.println("Ingrese la duración:");
        int duration = scanner.nextInt();

        System.out.println("Ingrese el año:");
        int year = scanner.nextInt();

        System.out.println("¿Cuántos minutos has tardado en verla?");
        int timeViewed = scanner.nextInt();

        Movie newMovie = new Movie(title, genre, creator, duration, timeViewed, year);

        System.out.println("Ingrese el Id:");
        int id = scanner.nextInt();
        newMovie.setId(id);

        System.out.println("¿La has visto? (true/false):");
        boolean viewed = scanner.nextBoolean();
        scanner.nextLine(); // Consumir el salto de línea residual
        newMovie.setViewed(viewed);

        movies.add(newMovie);
        System.out.println("Película agregada con éxito");
    }

    public static void verMovies() {
        if (movies.isEmpty()) {
            System.out.println("No se han agregado películas.\nDebes agregar una película");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué atributo quieres ver?");
        System.out.println("1. Título");
        System.out.println("2. Género");
        System.out.println("3. Creador");
        System.out.println("4. Duración");
        System.out.println("5. Año");
        System.out.println("6. Ver todo");
        System.out.print("Ingrese su opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea residual

        System.out.println("\nDetalles de las películas:");
        for (Movie movie : movies) {
            switch (opcion) {
                case 1:
                    System.out.println("Id: " + movie.getId() + " Título: " + movie.getTitle());
                    break;
                case 2:
                    System.out.println("Id: " + movie.getId() + " Género: " + movie.getGenre());
                    break;
                case 3:
                    System.out.println("Id: " + movie.getId() + " Creador: " + movie.getCreator());
                    break;
                case 4:
                    System.out.println("Id: " + movie.getId() + " Duración: " + movie.getDuration());
                    break;
                case 5:
                    System.out.println("Id: " + movie.getId() + " Año: " + movie.getYear());
                    break;
                case 6:
                    System.out.println("Id: " + movie.getId());
                    System.out.println("Título: " + movie.getTitle());
                    System.out.println("Género: " + movie.getGenre());
                    System.out.println("Creador: " + movie.getCreator());
                    System.out.println("Duración: " + movie.getDuration());
                    System.out.println("Año: " + movie.getYear());
                    System.out.println("Vista: " + movie.getViewed());
                    System.out.println("Tiempo tardado: " + movie.getTimeViewed());
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
                " Movie{" +
                "timeViewed=" + timeViewed +
                '}';
    }
}
