package com.doglabel.com;

import java.io.Serializable;
import java.util.ArrayList;

public class Movie implements Serializable {

    private String title;
    public ArrayList<Actor> cast;

    public Movie(String title, ArrayList<Actor> cast) {
        this.title = title;
        this.cast = cast;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCast(ArrayList<Actor> cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Actor actor: cast) {
            sb.append(actor.toString() + " * ");
        }
        return title + " << *** >> " + sb.toString();
    }
}