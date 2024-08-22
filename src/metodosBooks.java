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
        int isbn = scanner.nextInt();

        Book newBook = new Book(title, editionDate, editorial,isbn);
        books.add(newBook);
        System.out.println("Libro agregado con éxito");
    }

    public void verBooks() {
        if (books.isEmpty()) {
            System.out.println("No se han agregado libros.\nDebes agregar un libro");
            return;
        }
        System.out.println("\nDetalles de los libros agregados:");
        for (Book book : books) {
            System.out.println("Título: " + book.getTitle());
            System.out.println("Fecha de Edición: " + book.getEditionDate());
            System.out.println("Editorial: " + book.getEditorial());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Autores: " + book.getAuthors());
            System.out.println("Leído: " + book.isReaded());
            System.out.println("Tiempo Leído: " + book.getTimeReaded() + " minutos");
            System.out.println(); // Línea en blanco entre libros
        }
    }
}
