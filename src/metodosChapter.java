import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Scanner;
import edu.misena.senaviewer.model.Chapter;

public class metodosChapter {
    private List<Chapter> chapters;

    public metodosChapter() {
        chapters = new ArrayList<>();
    }

    public void addChapter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el título del capítulo:");
        String title = scanner.nextLine();

        System.out.println("Ingrese la duración:");
        String duration = scanner.nextLine();

        System.out.println("Ingrese el año:");
        String yearStr = scanner.nextLine();
        Date year = new Date();

        Chapter newChapter = new Chapter(title, duration, year);
        chapters.add(newChapter);
        System.out.println("Capítulo agregado con éxito");
    }

    public void verChapters() {
        if (chapters.isEmpty()) {
            System.out.println("No se han agregado capítulos.\nDebes agregar un capítulo");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué atributo quieres ver?");
        System.out.println("1. Título");
        System.out.println("2. Duración");
        System.out.println("3. Año");
        System.out.println("4. Ver todo");
        System.out.print("Ingrese su opción: ");
        int opcion = scanner.nextInt();


        System.out.println("\nDetalles de los capítulos:");
        for (Chapter chapter : chapters) {
            switch (opcion) {
                case 1:
                    System.out.println("Título: " + chapter.getTitle());
                    break;
                case 2:
                    System.out.println("Duración: " + chapter.getDuration());
                    break;
                case 3:
                    System.out.println("Año: " + chapter.getYear());
                    break;
                case 4:
                    System.out.println("Título: " + chapter.getTitle());
                    System.out.println("Duración: " + chapter.getDuration());
                    System.out.println("Año: " + chapter.getYear());
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }
            System.out.println(); // Línea en blanco entre capítulos
        }
    }
}
