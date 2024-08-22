package edu.misena.senaviewer.model;

import java.util.Date;

public class Chapter {
    private int id;
    private String title;
    private String duration;
    private Date year;
    private int viewed;
    private int timeViewed;
    private int sessionNumber;

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

    public int getViewed() {
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

    public void setViewed(int viewed) {
        this.viewed = viewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }
}
