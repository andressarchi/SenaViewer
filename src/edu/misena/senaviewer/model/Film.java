package edu.misena.senaviewer.model;

public class Film {
    public int id;
    public String title;
    public String genre;
    public String creator;
    public int duration;
    public int  year ;
    public boolean viewed ;

   public  Film(String title,String genre,String creator,int duration){
       super();
       this.title = title;
       this.genre= genre;
       this.creator = creator;
       this.duration = duration;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean getViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", creator='" + creator + '\'' +
                ", duration=" + duration +
                ", year=" + year +
                ", viewed=" + viewed +
                '}' ;
    }
}
