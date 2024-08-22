import java.util.Scanner;
import edu.misena.senaviewer.model.Book;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        metodosBooks bookMethods = new metodosBooks(); // Crear una instancia de metodosBooks

        int opcion = 0; // Inicializa opcion con un valor por defecto
        int opcion2 = 0;

        while (opcion != 7) {
            System.out.println("¿A qué sección quieres entrar?");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("7. Exit");

            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado Movies.");
                    // Lógica para Movies
                    System.out.println("Qué quieres hacer \n1. Ver las películas\n2. Agregar película");
                    break;
                case 2:
                    System.out.println("Has seleccionado Series.");
                    // Lógica para Series
                    break;
                case 3:
                    System.out.println("Has seleccionado Books.");
                    // Lógica para Books
                    System.out.println("Qué quieres hacer \n1. Ver libros\n2. Agregar libros");
                    opcion2 = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcion2) {
                        case 1:
                            bookMethods.verBooks();
                            break;
                        case 2:
                            bookMethods.addBook();
                            break;
                        default:
                            System.out.println("Opción inválida en Books.");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Has seleccionado Magazines.");
                    // Lógica para Magazines
                    break;
                case 5:
                    System.out.println("Has seleccionado Report.");
                    // Lógica para Report
                    break;
                case 6:
                    System.out.println("Has seleccionado Report Today.");
                    // Lógica para Report Today
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción entre 1 y 7.");
                    break;
            }
        }

        scanner.close(); // Cerrar el scanner
    }
}
