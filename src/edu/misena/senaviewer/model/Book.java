package edu.misena.senaviewer.model;

public class Book {
    public int id;
    public String title;
    public String editionDate;
    public String editorial;
    public String authors;
    public int isbn;
    public boolean readed;
    public int timeReaded;

    public Book(String title, String editionDate, String editorial, int isbn){
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getEditionDate() {
        return editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getAuthors() {
        return authors;
    }

    public int getIsbn() {
        return isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEditionDate(String editionDate) {
        this.editionDate = editionDate;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }
}
