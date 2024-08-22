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



        System.out.println("Ingrese el Id:");
        int Id = scanner.nextInt();
        newChapter.setId(Id);

        System.out.println("Ingrese el Id:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea residual


        System.out.println("¿Has visto el capítulo? (true/false):");
        boolean viewed = scanner.nextBoolean();
        scanner.nextLine(); // Consumir el salto de línea residual
        newChapter.setViewed(viewed);

        System.out.println("¿Cuántos minutos ha tardado en verlo?");
        int tiempo = scanner.nextInt();
        scanner.nextLine();
        newChapter.setTimeViewed(tiempo);

        System.out.println("¿Cuántos minutos ha tardado en verlo?");
        int capitulo = scanner.nextInt();
        scanner.nextLine();
        newChapter.setSessionNumber(capitulo);

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