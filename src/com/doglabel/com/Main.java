package com.doglabel.com;

public class Main {

    public static void main(String[] args) {
//        1. Create 4 movies
        Movie m1 = new Movie("The Avengers", "Robert Downey Jr.");
        Movie m2 = new Movie("Terminator", "Arnold Schwarzenegger");
        Movie m3 = new Movie("The Predator", "Arnold Schwarzenegger");
        Movie m4 = new Movie("Star Wars", "Harrison Ford, Samuel Jackson");
//        2. Create a collection
        MovieCollection movieCollection = new MovieCollection();
//        3. Add movies to the collection
        movieCollection.addMovie(m1);
        movieCollection.addMovie(m2);
        movieCollection.addMovie(m3);
        movieCollection.addMovie(m4);
//        4. Write to file
        movieCollection.writeToFile(movieCollection);
//        5. Read from file
        movieCollection.readFile();
//        6. Edit a movie
        movieCollection.editMovie("The Avengers", "Robert Downey Jr. / Mark Ruffalo");
        System.out.println(movieCollection.showAll());
//        7. Delete a movie
        movieCollection.deleteMovie("Terminator");
        System.out.println(movieCollection.showAll());
//        8. Write the collection back
        movieCollection.writeToFile(movieCollection);
    }
}
