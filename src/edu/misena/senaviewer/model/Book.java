package edu.misena.senaviewer.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book extends Publication {
    private int id;
    private int isbn;
    private boolean readed;
    private int timeReaded;
    private static List<Book> books = new ArrayList<>();

    public Book(String title, String editionDate, String editorial, String authors, int id, int isbn, boolean readed) {
        super(title, editionDate, editorial, authors);
        this.id = id;
        this.isbn = isbn;
        this.readed = readed;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIsbn() { return isbn; }
    public void setIsbn(int isbn) { this.isbn = isbn; }

    public boolean getReaded() { return readed; }
    public void setReaded(boolean readed) { this.readed = readed; }

    public int getTimeReaded() { return timeReaded; }
    public void setTimeReaded(int timeReaded) { this.timeReaded = timeReaded; }

    // Method to add a new book
    public static void addBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el título del libro:");
        String title = scanner.nextLine();

        System.out.println("Ingrese la fecha de edición (YYYY-MM-DD):");
        String editionDate = scanner.nextLine();

        System.out.println("Ingrese la editorial:");
        String editorial = scanner.nextLine();

        System.out.println("Ingrese el ISBN:");
        int isbn = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea residual

        System.out.println("Ingrese el autor:");
        String author = scanner.nextLine();

        System.out.println("Ingrese el Id:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea residual

        System.out.println("Ingrese si ha leído el libro (true/false):");
        boolean readed = scanner.nextBoolean();
        scanner.nextLine(); // Consumir el salto de línea residual

        System.out.println("¿Cuántos minutos ha tardado en leerlo?");
        int timeReaded = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea residual

        Book newBook = new Book(title, editionDate, editorial, author, id, isbn, readed);
        newBook.setTimeReaded(timeReaded);

        books.add(newBook);
        System.out.println("Libro agregado con éxito");
    }

    // Method to view books
    public static void viewBooks() {
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
        System.out.println("8. Ver todo");
        System.out.print("Ingrese su opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea residual

        System.out.println("\nDetalles de los libros:");
        for (Book book : books) {
            switch (opcion) {
                case 1:
                    System.out.println("Id: " + book.getId() + " Título: " + book.getTitle());
                    break;
                case 2:
                    System.out.println("Id: " + book.getId() + " Fecha de Edición: " + book.getEditionDate());
                    break;
                case 3:
                    System.out.println("Id: " + book.getId() + " Editorial: " + book.getEditorial());
                    break;
                case 4:
                    System.out.println("Id: " + book.getId() + " ISBN: " + book.getIsbn());
                    break;
                case 5:
                    System.out.println("Id: " + book.getId() + " Autor: " + book.getAuthors());
                    break;
                case 6:
                    System.out.println("Id: " + book.getId() + " Leído: " + book.getReaded());
                    break;
                case 7:
                    System.out.println("Id: " + book.getId() + " Tiempo Leído: " + book.getTimeReaded() + " minutos");
                    break;
                case 8:
                    System.out.println("Id: " + book.getId());
                    System.out.println("Título: " + book.getTitle());
                    System.out.println("Fecha de Edición: " + book.getEditionDate());
                    System.out.println("Editorial: " + book.getEditorial());
                    System.out.println("ISBN: " + book.getIsbn());
                    System.out.println("Autores: " + book.getAuthors());
                    System.out.println("Leído: " + book.getReaded());
                    System.out.println("Tiempo Leído: " + book.getTimeReaded() + " minutos");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return super.toString()+
                "Book{" +
                "id=" + id +
                ", isbn=" + isbn +
                ", readed=" + readed +
                ", timeReaded=" + timeReaded +
                '}';
    }
}
