package edu.misena.senaviewer.model;
import java.util.Date;

public class Serie extends Film {
    private int timeViewed;
    private int sessionQuantity;

    public Serie(String title,String genre,String creator,int duration,int timeViewed,int sessionQuantity) {
        super( title, genre,creator, duration);
        this.timeViewed = timeViewed;
        this.sessionQuantity = sessionQuantity;

    }



    public int getTimeViewed() {
        return timeViewed;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }




    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }
}
