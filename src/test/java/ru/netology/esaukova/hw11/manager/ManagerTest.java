package ru.netology.esaukova.hw11.manager;

import org.junit.jupiter.api.Test;
import ru.netology.esaukova.hw11.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {

    Movie movie1 = new Movie(1, "Бладшот", "боевик");
    Movie movie2 = new Movie(2, "Вперёд", "мультфильм");
    Movie movie3 = new Movie(3, "Отель Белград", "комедия");
    Movie movie4 = new Movie(4, "Джентльмены", "боевик");
    Movie movie5 = new Movie(5, "Человек-неведимка", "ужасы");
    Movie movie6 = new Movie(6, "Тролли.Мировой тур", "мультфильм");
    Movie movie7 = new Movie(7, "Номер один", "комедия");

    @Test
    public void defaultLimitTest() {
        Manager manager = new Manager();
        assertEquals(5, manager.getLimit());
    }

    @Test
    public void addMovieTest() {
        Manager manager = new Manager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);

        Movie[] actual = manager.findAll();
        Movie[] expected = {movie1, movie2};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void findAllTest() {
        Manager manager = new Manager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);


        Movie[] actual = manager.findAll();
        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastTest() {
        Manager manager = new Manager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);


        Movie[] actual = manager.findLast();
        Movie[] expected = {movie7, movie6, movie5, movie4, movie3};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastWithLimitAboveMovieLengthTest() {
        Manager manager = new Manager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);


        Movie[] actual = manager.findLast();
        Movie[] expected = {movie4, movie3, movie2, movie1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void setCustomLimitTest() {
        Manager manager = new Manager(3);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);


        Movie[] actual = manager.findLast();
        Movie[] expected = {movie7, movie6, movie5};

        assertArrayEquals(actual, expected);
    }

}
