package com.doglabel.com;

import java.sql.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        1. Create 5 actors
        Actor actor1 = new Actor("Robert Downey Jr.");
        Actor actor2 = new Actor("Arnold Schwarzenegger");
        Actor actor3 = new Actor("Harrison Ford");
        Actor actor4 = new Actor("Samuel Jackson");
        Actor actor5 = new Actor("Mark Ruffalo");
//        2. Put them in respective arrays
        ArrayList<Actor> movie1Cast = new ArrayList<>();
        movie1Cast.add(actor1);

        ArrayList<Actor> movie2Cast = new ArrayList<>();
        movie2Cast.add(actor2);

        ArrayList<Actor> movie3Cast = new ArrayList<>();
        movie3Cast.add(actor3);
        movie3Cast.add(actor4);

//        3. Create movies
        Movie movie1 = new Movie("The Avengers", movie1Cast);
        Movie movie2 = new Movie("The Terminator", movie2Cast);
        Movie movie3 = new Movie("The Predator", movie2Cast);
        Movie movie4 = new Movie("Star Wars", movie3Cast);

//        4. Create a collection
        MovieCollection movieCollection = new MovieCollection();
//        5. Add movies to the collection
        movieCollection.addMovie(movie1);
        movieCollection.addMovie(movie2);
        movieCollection.addMovie(movie3);
        movieCollection.addMovie(movie4);
//        6. Write to file
        movieCollection.writeToFile(movieCollection, "movies.bin");
//        7. Read from file
        movieCollection.readFile("movies.bin");
//        8. Edit a movie
        movie1Cast.add(actor5);
        movieCollection.editMovie("The Avengers", movie1Cast);
        System.out.println(movieCollection.showAll());
//        9. Delete a movie
        movieCollection.deleteMovie("The Terminator");
        System.out.println(movieCollection.showAll());
//        10. Write the collection back
        movieCollection.writeToFile(movieCollection, "movies.bin");
    }
}
