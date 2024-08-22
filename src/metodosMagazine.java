import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import edu.misena.senaviewer.model.Magazine;

public class metodosMagazine {
    private List<Magazine> magazines;

    public metodosMagazine() {
        magazines = new ArrayList<>();
    }

    public void addMagazine() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el título de la revista:");
        String title = scanner.nextLine();

        System.out.println("Ingrese la fecha de edición:");
        String edititionDate = scanner.nextLine();

        System.out.println("Ingrese la editorial:");
        String editorial = scanner.nextLine();

        Magazine newMagazine = new Magazine(title, edititionDate, editorial);


        System.out.println("Ingrese el Id:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea residual
        newMagazine.setId(id);

        System.out.println("Ingrese el autor:");
        String autor = scanner.nextLine();
        scanner.nextLine(); // Consumir el salto de línea residual
        newMagazine.setAuthors(autor);


        magazines.add(newMagazine);
        System.out.println("Revista agregada con éxito");
    }

    public void verMagazines() {
        if (magazines.isEmpty()) {
            System.out.println("No se han agregado revistas.\nDebes agregar una revista");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué atributo quieres ver?");
        System.out.println("1. Título");
        System.out.println("2. Fecha de Edición");
        System.out.println("3. Editorial");
        System.out.println("4. Id");
        System.out.println("5. autor");
        System.out.println("6. ver todo");
        System.out.print("Ingrese su opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("\nDetalles de las revistas:");
        for (Magazine magazine : magazines) {
            switch (opcion) {
                case 1:
                    System.out.println("id:"+magazine.getId()+"Título: " + magazine.getTitle());
                    break;
                case 2:
                    System.out.println("Fecha de Edición: " + magazine.getEditionDate());
                    break;
                case 3:
                    System.out.println("Editorial: " + magazine.getEditorial());
                    break;
                case 4:
                    System.out.println("Id: " + magazine.getId());
                    break;
                case 5:
                    System.out.println("autor: " + magazine.getAuthors());
                    break;
                case 6:
                    System.out.println("Título: " + magazine.getTitle());
                    System.out.println("Fecha de Edición: " + magazine.getEditionDate());
                    System.out.println("Editorial: " + magazine.getEditorial());
                    System.out.println("Id: " + magazine.getId());
                    System.out.println("autor: " + magazine.getAuthors());
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return; // Salir del método si la opción es inválida
            }
            System.out.println(); // Línea en blanco entre revistas
        }
    }
}
