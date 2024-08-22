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
        String duration = scanner.nextLine();

        Serie newSerie = new Serie(title, genre, duration);
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
        System.out.println("4. Ver todo");
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
                    System.out.println("Título: " + serie.getTitle());
                    System.out.println("Género: " + serie.getGenre());
                    System.out.println("Duración: " + serie.getDuration());
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }
            System.out.println(); // Línea en blanco entre series
        }
    }
}
