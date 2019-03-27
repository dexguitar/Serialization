package com.doglabel.com;

import java.io.Serializable;

public class Movie implements Serializable {
// Props
    private String title;
    private String cast;
// Constr
    public Movie(String title, String cast) {
        this.title = title;
        this.cast = cast;
    }
// Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }
//    toStr
    @Override
    public String toString() {
        return title + " << *** >> " + cast;
    }
}