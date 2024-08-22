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


        System.out.println("Ingrese el Id:");
        int Id = scanner.nextInt();
        newMovie.setId(Id);

        System.out.println("¿la has visto?(true/false):");
        boolean visto = scanner.nextBoolean();
        scanner.nextLine(); // Consumir el salto de línea residual
        newMovie.setViewed(visto);

        System.out.println("¿Cuántos minutos has tardado en vertela ?");
        int tiempo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea residual
        newMovie.setTimeViewed(tiempo);

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
                    System.out.println("Id: " + movie.getId()+"Título: " + movie.getTitle());
                    break;
                case 2:
                    System.out.println("Id: " + movie.getId()+"Género: " + movie.getGenre());
                    break;
                case 3:
                    System.out.println("Id: " + movie.getId()+"Creador: " + movie.getCreator());
                    break;
                case 4:
                    System.out.println("Id: " + movie.getId()+"Duración: " + movie.getDuration());
                    break;
                case 5:
                    System.out.println("Id: " + movie.getId()+"Año: " + movie.getYear());
                    break;
                case 6:
                    System.out.println("Id: " + movie.getId());
                    System.out.println("Título: " + movie.getTitle());
                    System.out.println("Género: " + movie.getGenre());
                    System.out.println("Creador: " + movie.getCreator());
                    System.out.println("Duración: " + movie.getDuration());
                    System.out.println("Año: " + movie.getYear());
                    System.out.println("vista: " + movie.getViewed());
                    System.out.println("tiempo tardado: " + movie.getTimeViewed());

                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }
            System.out.println(); // Línea en blanco entre películas
        }
    }
}