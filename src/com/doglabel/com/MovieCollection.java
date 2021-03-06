package com.doglabel.com;

import java.io.*;
import java.util.ArrayList;

public class MovieCollection implements Serializable {
    ArrayList<Movie> movies = null;

    public MovieCollection() {
        this.movies = new ArrayList<>();
    }

    public String showAll() {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (Movie m: movies) {
            sb.append(String.valueOf(count) + ": " + m + "\n");
            count++;
        }
        return sb.toString();
    }

    public void addMovie(Movie m) {
        movies.add(m);
    }

    public void editMovie(String title, String cast) {
        Movie movie = null;
        for (Movie m: movies) {
            if (m.getTitle().equals(title)) {
                movie = m;
            }
        }
        movie.setTitle(title);
        movie.setCast(cast);
    }

    public void deleteMovie(String title) {
        for (Movie m: movies) {
            if (m.getTitle().equals(title)) {
                int index = movies.indexOf(m);
                movies.remove(index);
                break;
            }
        }
    }

    public void writeToFile(Object obj) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("movies.bin"))) {
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Write successful!");
    }

    public void readFile() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("movies.bin"));
            MovieCollection mc;
            mc = (MovieCollection) objectInputStream.readObject();
            movies = mc.movies;
            System.out.println("Read successful!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
