import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import edu.misena.senaviewer.model.Serie;

public class metodosSeries {
    private List<Serie> series;

    public metodosSeries() {
        series = new ArrayList<>();
    }

    public void addSerie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el título de la serie:");
        String title = scanner.nextLine();

        System.out.println("Ingrese el género:");
        String genre = scanner.nextLine();

        System.out.println("Ingrese la duración:");
        int duration = scanner.nextInt();



        Serie newSerie = new Serie(title, genre, duration);





        System.out.println("Ingrese el Id:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea residual
        newSerie.setId(id);

        System.out.println("Ingrese el creador:");
        String autor = scanner.nextLine();
        scanner.nextLine(); // Consumir el salto de línea residual
        newSerie.setCreator(autor);


        System.out.println("Ingrese el año (aaaa-mm-dd):");
        String year = scanner.nextLine();
        scanner.nextLine(); // Consumir el salto de línea residual
        newSerie.setYear(year);

        System.out.println("Ingrese el tiempo que ha tomado en verla :");
        int tiempo  = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea residual
        newSerie.setTimeViewed(tiempo);

        System.out.println("¿ya la viste? (true/false)");
        boolean visto= scanner.nextBoolean();
        scanner.nextLine(); // Consumir el salto de línea residual
        newSerie.setViewed(visto);

        System.out.println("¿en que sesion vas?:");
        int sesion  = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea residual
        newSerie.setSessionQuantity(sesion);

        series.add(newSerie);
        System.out.println("Serie agregada con éxito");
    }

    public void verSeries() {
        if (series.isEmpty()) {
            System.out.println("No se han agregado series.\nDebes agregar una serie");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué atributo quieres ver?");
        System.out.println("1. Título");
        System.out.println("2. Género");
        System.out.println("3. Duración");
        System.out.println("4. sesion");
        System.out.println("5. Vista");
        System.out.println("6. tiempo en verla");
        System.out.println("7.año");
        System.out.println("8. Ver todo");
        System.out.print("Ingrese su opción: ");
        int opcion = scanner.nextInt();


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
                    System.out.println("sesion: " + serie.getSessionQuantity());
                    break;
                case 5:
                    System.out.println("vista: " + serie.getViewed());
                    break;
                case 6:
                    System.out.println("tiempo en verla: " + serie.getTimeViewed());
                    break;
                case 7:
                    System.out.println("año: " + serie.getYear());
                    break;

                case 8:
                    System.out.println("Título: " + serie.getTitle());
                    System.out.println("Género: " + serie.getGenre());
                    System.out.println("Duración: " + serie.getDuration());
                    System.out.println("sesion: " + serie.getSessionQuantity());
                    System.out.println("vista: " + serie.getViewed());
                    System.out.println("tiempo en verla: " + serie.getTimeViewed());
                    System.out.println("año: " + serie.getYear());
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }
            System.out.println(); // Línea en blanco entre series
        }
    }
}
