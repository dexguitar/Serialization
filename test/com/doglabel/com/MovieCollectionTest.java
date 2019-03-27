// Tests

package com.doglabel.com;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionTest {

    @Test
    void shouldPrintAllMovies() {
        MovieCollection mc = new MovieCollection();
        Movie movie = new Movie("Jay and Silent Bob", "The Best Cast");
        mc.addMovie(movie);
        assertEquals("1: Jay and Silent Bob << *** >> The Best Cast", mc.showAll());
    }

    @Test
    void readFileShouldAssignReadCollectionToTheMovies() {
        Movie m1 = new Movie("The Avengers", "Robert Downey Jr.");
        Movie m2 = new Movie("Terminator", "Arnold Schwarzenegger");
        Movie m3 = new Movie("The Predator", "Arnold Schwarzenegger");
        Movie m4 = new Movie("Star Wars", "Harrison Ford, Samuel Jackson");

        MovieCollection mc = new MovieCollection();

        mc.addMovie(m1);
        mc.addMovie(m2);
        mc.addMovie(m3);
        mc.addMovie(m4);

        mc.writeToFile(mc);

        mc.readFile();

        assertEquals("The Avengers << *** >> Robert Downey Jr.", mc.movies.get(0));
    }
}