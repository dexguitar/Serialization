package com.doglabel.com;

import java.io.Serializable;

public class Movie implements Serializable {

    private String title;
    private String cast;

    public Movie(String title, String cast) {
        this.title = title;
        this.cast = cast;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return title + " << *** >> " + cast;
    }
}