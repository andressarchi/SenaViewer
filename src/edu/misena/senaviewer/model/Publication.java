package edu.misena.senaviewer.model;

public class Publication {
    public String title;
    public String editionDate;
    public String editorial;
    public String authors;


    public Publication(String title, String editionDate, String editorial, String authors) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
    }

    ;


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


    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", editionDate='" + editionDate + '\'' +
                ", editorial='" + editorial + '\'' +
                ", authors='" + authors + '\'' +
                '}' ;
    }
}
