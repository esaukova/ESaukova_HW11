package ru.netology.esaukova.hw11.manager;

import ru.netology.esaukova.hw11.domain.Movie;

public class Manager {
    private Movie[] movies = new Movie[0];
    private int limit = 5;

    public Manager(int limit) {
        this.limit = limit;
    }

    public Manager() {
    }

    public int getLimit() {
        return limit;
    }

    public void addMovie(Movie movie) {
        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public Movie[] findLast() {
        int resultLength;
        if (limit < movies.length) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];  // заполняем result из массива, что лежит в поле в обратном порядке
        }

        return result;
    }
}