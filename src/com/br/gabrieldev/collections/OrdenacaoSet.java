package com.br.gabrieldev.collections;

import java.util.*;

public class OrdenacaoSet {

    public static void main(String args[]) {
        
        System.out.println("Ordem aleatória");
        Set<Movie> movies = new HashSet<Movie>(){{
           add(new Movie("got","fantasy", 60));
           add(new Movie("batman","action", 180));
           add(new Movie("spider man","adventure", 120));
        }};

        System.out.println(Arrays.asList(movies));

        System.out.println("\n Ordem inserção");
        Set<Movie> movies1 = new LinkedHashSet<Movie>(){{
           add(new Movie("got","fantasy", 60));
           add(new Movie("batman","action", 180));
           add(new Movie("spider man","adventure", 120));
        }};

        System.out.println(Arrays.asList(movies1));

        System.out.println("\n Ordem natural (TimeEpisode)");
        Set<Movie> movies2 = new TreeSet<Movie>(movies1);
 
        System.out.println(Arrays.asList(movies2));
    }

}

class Movie implements Comparable<Movie> {
    private String name;
    private String gender;
    private Integer timeEpisode;

    public Movie(String name, String gender, Integer timeEpisode) {
        this.name = name;
        this.gender = gender;
        this.timeEpisode = timeEpisode;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Integer getTimeEpisode() {
        return timeEpisode;
    }

    @Override
    public int compareTo(Movie movie) {
        int timeEpisode = Integer.compare(this.getTimeEpisode(), movie.getTimeEpisode());
        if (timeEpisode != 0)
            return timeEpisode;
        return this.getGender().compareTo(movie.getGender());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Movie movie = (Movie) o;
        return name.equals(movie.name) && gender.equals(movie.gender) && timeEpisode.equals(movie.timeEpisode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, timeEpisode);
    }

}