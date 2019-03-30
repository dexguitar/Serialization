package com.doglabel.com;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionTest {

    @Test
    void shouldPrintAllMovies() {
        Actor actor1 = new Actor("The Best Cast");
        ArrayList<Actor> movie1Cast = new ArrayList<>();
        movie1Cast.add(actor1);
        Movie movie1 = new Movie("Jay and Silent Bob", movie1Cast);
        MovieCollection mc = new MovieCollection();
        mc.addMovie(movie1);
        assertEquals("1: Jay and Silent Bob << *** >> The Best Cast * ", mc.showAll());
    }

    @Test
    void readFileShouldAssignReadCollectionToTheMovies() {
        Actor actor1 = new Actor("Robert Downey Jr.");
        Actor actor2 = new Actor("Arnold Schwarzenegger");
        Actor actor3 = new Actor("Harrison Ford");
        Actor actor4 = new Actor("Samuel Jackson");

        ArrayList<Actor> movie1Cast = new ArrayList<>();
        movie1Cast.add(actor1);

        ArrayList<Actor> movie2Cast = new ArrayList<>();
        movie2Cast.add(actor2);

        ArrayList<Actor> movie3Cast = new ArrayList<>();
        movie3Cast.add(actor3);
        movie3Cast.add(actor4);

        Movie movie1 = new Movie("The Avengers", movie1Cast);
        Movie movie2 = new Movie("Terminator", movie2Cast);
        Movie movie3 = new Movie("The Predator", movie2Cast);
        Movie movie4 = new Movie("Star Wars", movie3Cast);

        MovieCollection mc = new MovieCollection();

        mc.addMovie(movie1);
        mc.addMovie(movie2);
        mc.addMovie(movie3);
        mc.addMovie(movie4);

        mc.writeToFile(mc, "movies.bin");

        mc.readFile("movies.bin");

        assertEquals("The Avengers << *** >> Robert Downey Jr. * ", mc.movies.get(0));
    }
}