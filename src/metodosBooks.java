import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import edu.misena.senaviewer.model.Book;

public class metodosBooks {
    private List<Book> books;

    public metodosBooks() {
        books = new ArrayList<>();
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el título del libro:");
        String title = scanner.nextLine();

        System.out.println("Ingrese la fecha de edición (YYYY-MM-DD):");
        String editionDate = scanner.nextLine();

        System.out.println("Ingrese la editorial:");
        String editorial = scanner.nextLine();

        System.out.println("Ingrese el ISBN:");
        int isbn = scanner.nextInt(); // Cambiado a String

        Book newBook = new Book(title, editionDate, editorial, isbn);
        books.add(newBook);
        System.out.println("Libro agregado con éxito");
    }

    public void verBooks() {
        if (books.isEmpty()) {
            System.out.println("No se han agregado libros.\nDebes agregar un libro");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué atributo quieres ver?");
        System.out.println("1. Título");
        System.out.println("2. Fecha de Edición");
        System.out.println("3. Editorial");
        System.out.println("4. ISBN");
        System.out.println("5. Autores");
        System.out.println("6. Leído");
        System.out.println("7. Tiempo Leído");
        System.out.println("8. ver todo");
        System.out.print("Ingrese su opción: ");
        int opcion = scanner.nextInt();


        System.out.println("\nDetalles de los libros:");
        for (Book book : books) {
            switch (opcion) {
                case 1:
                    System.out.println("Título: " + book.getTitle());
                    break;
                case 2:
                    System.out.println("Fecha de Edición: " + book.getEditionDate());
                    break;
                case 3:
                    System.out.println("Editorial: " + book.getEditorial());
                    break;
                case 4:
                    System.out.println("ISBN: " + book.getIsbn());
                    break;
                case 5:
                    System.out.println("Autores: " + book.getAuthors());
                    break;
                case 6:
                    System.out.println("Leído: " + book.isReaded());
                    break;
                case 7:
                    System.out.println("Tiempo Leído: " + book.getTimeReaded() + " minutos");
                    break;
                case 8 :
                    System.out.println("Título: " + book.getTitle());
                    System.out.println("Fecha de Edición: " + book.getEditionDate());
                    System.out.println("Editorial: " + book.getEditorial());
                    System.out.println("ISBN: " + book.getIsbn());
                    System.out.println("Autores: " + book.getAuthors());
                    System.out.println("Leído: " + book.isReaded());
                    System.out.println("Tiempo Leído: " + book.getTimeReaded() + " minutos");

                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }
            System.out.println(); // Línea en blanco entre libros
        }
    }
}
