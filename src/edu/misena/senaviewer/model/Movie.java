package edu.misena.senaviewer.model;
public class Movie extends Film {

    public int timeViewed;

    public Movie(String title,String genre,String creator,int duration,int timeViewed) {
        super(title, genre,creator,duration);
        this.timeViewed = timeViewed;
    }


    public int getTimeViewed() {
        return timeViewed;
    }
    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }
}
