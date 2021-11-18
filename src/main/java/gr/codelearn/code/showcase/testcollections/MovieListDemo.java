package gr.codelearn.code.showcase.testcollections;

import java.util.*;

public class MovieListDemo {
    public static void main(String[] args) {
        Movie movie1 = new Movie("123", "Avengers: Infinity War");
        Movie movie2 = new Movie("234", "Avengers: EndGame");
        Movie movie3 = new Movie("345", "DeadPool");
        Movie movie4 = new Movie("456", "Dr Strange");

        List<Movie> myMovieList = new LinkedList<>();
        myMovieList.add(movie1);
        myMovieList.add(movie2);
        myMovieList.add(movie3);
        myMovieList.add(movie4);

        for(Movie i : myMovieList){
            System.out.println(i);
        }
        System.out.println("-----");

    }
}
