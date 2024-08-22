import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import edu.misena.senaviewer.model.Movie;

public class metodosMovie {
    private List<Movie> movies;

    public metodosMovie() {
        movies = new ArrayList<>();
    }

    public void addMovie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el título de la película:");
        String title = scanner.nextLine();

        System.out.println("Ingrese el género:");
        String genre = scanner.nextLine();

        System.out.println("Ingrese el creador:");
        String creator = scanner.nextLine();

        System.out.println("Ingrese la duración:");
        String duration = scanner.nextLine();

        System.out.println("Ingrese el año:");
        int year = scanner.nextInt();

        Movie newMovie = new Movie(title, genre, creator, duration, year);
        movies.add(newMovie);
        System.out.println("Película agregada con éxito");
    }

    public void verMovies() {
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


        System.out.println("\nDetalles de las películas:");
        for (Movie movie : movies) {
            switch (opcion) {
                case 1:
                    System.out.println("Título: " + movie.getTitle());
                    break;
                case 2:
                    System.out.println("Género: " + movie.getGenre());
                    break;
                case 3:
                    System.out.println("Creador: " + movie.getCreator());
                    break;
                case 4:
                    System.out.println("Duración: " + movie.getDuration());
                    break;
                case 5:
                    System.out.println("Año: " + movie.getYear());
                    break;
                case 6:
                    System.out.println("Título: " + movie.getTitle());
                    System.out.println("Género: " + movie.getGenre());
                    System.out.println("Creador: " + movie.getCreator());
                    System.out.println("Duración: " + movie.getDuration());
                    System.out.println("Año: " + movie.getYear());
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }
            System.out.println(); // Línea en blanco entre películas
        }
    }
}
