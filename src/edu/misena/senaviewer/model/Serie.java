package edu.misena.senaviewer.model;
import java.util.Date;

public class Serie {
    private int id;
    private String title;
    private String genre;
    private String creator;
    private String duration;
    private Date year;
    private int viewed;
    private int timeViewed;
    private int sessionQuantity;

    public Serie(String title, String genre, String duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getCreator() {
        return creator;
    }

    public String getDuration() {
        return duration;
    }

    public Date getYear() {
        return year;
    }

    public int getViewed() {
        return viewed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public void setViewed(int viewed) {
        this.viewed = viewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }
}
