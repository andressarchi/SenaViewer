import edu.misena.senaviewer.model.Book;
import edu.misena.senaviewer.model.Magazine;
import edu.misena.senaviewer.model.Movie;
import edu.misena.senaviewer.model.Serie;
import edu.misena.senaviewer.model.Chapter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int opcion2 = 0;

        // Instancias de los métodos para cada categoría


        while (opcion != 8) {
            System.out.println("¿A qué sección quieres entrar?");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Chapter");
            System.out.println("6. Report");
            System.out.println("7. Report Today");
            System.out.println("8. Exit");

            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado Movies.");
                    System.out.println("¿Qué quieres hacer?");
                    System.out.println("1. Ver películas");
                    System.out.println("2. Agregar película");
                    opcion2 = scanner.nextInt();
                    switch (opcion2) {
                        case 1:
                            Movie.verMovies();
                            break;
                        case 2:
                            Movie.addMovie();
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Has seleccionado Series.");
                    System.out.println("¿Qué quieres hacer?");
                    System.out.println("1. Ver series");
                    System.out.println("2. Agregar  serie");
                    opcion2 = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    switch (opcion2) {
                        case 1:
                            Serie.verSeries();
                            break;
                        case 2:
                            Serie.addSerie();
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Has seleccionado Books.");
                    System.out.println("¿Qué quieres hacer?");
                    System.out.println("1. Ver libros");
                    System.out.println("2. Agregar libro");
                    opcion2 = scanner.nextInt();
                    switch (opcion2) {
                        case 1:
                            Book.viewBooks();
                            break;
                        case 2:
                            Book.addBook();
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Has seleccionado Magazines.");
                    System.out.println("¿Qué quieres hacer?");
                    System.out.println("1. Ver revistas");
                    System.out.println("2. Agregar revista");
                    opcion2 = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    switch (opcion2) {
                        case 1:
                            Magazine.verMagazines();
                            break;
                        case 2:
                            Magazine.addMagazine();
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Has seleccionado Chapter.");
                    System.out.println("¿Qué quieres hacer?");
                    System.out.println("1. Ver Chapter");
                    System.out.println("2. Agregar Chapter");
                    opcion2 = scanner.nextInt();
                    switch (opcion2) {
                        case 1:
                            Chapter.verChapters();
                            break;
                        case 2:
                            Chapter.addChapter();
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }

                    break;
                case 6:
                    System.out.println("Has seleccionado Report .");

                    break;
                case 7:
                    System.out.println("Has seleccionado Report Today.");

                    break;
                case 8:
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