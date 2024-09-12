package edu.misena.senaviewer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Chapter {
    private int id;
    private String title;
    private String duration;
    private Date year;
    private boolean viewed;
    private int timeViewed;
    private int sessionNumber;
    private static List<Chapter> chapters= new ArrayList<>();

    public Chapter(String title, String duration, Date year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public Date getYear() {
        return year;
    }

    public boolean getViewed() {
        return viewed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }


    public static void addChapter() {
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


        newChapter.setTimeViewed(tiempo);

        System.out.println("¿Cuántos minutos ha tardado en verlo?");
        int capitulo = scanner.nextInt();
        scanner.nextLine();
        newChapter.setSessionNumber(capitulo);

        chapters.add(newChapter);
        System.out.println("Capítulo agregado con éxito");
    }
    public static void verChapters() {
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