package ru.netology.esaukova.hw11.domain;

import org.junit.jupiter.api.Test;
import ru.netology.esaukova.hw11.manager.Manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {
    Movie movie1 = new Movie(1, "Бладшот", "боевик");
    Movie movie2 = new Movie(2, "Вперёд", "мультфильм");
    Movie movie3 = new Movie(3, "Отель Белград", "комедия");
    Movie movie4 = new Movie(4, "Джентльмены", "боевик");
    Movie movie5 = new Movie(5, "Человек-неведимка", "ужасы");
    Movie movie6 = new Movie(6, "Тролли.Мировой тур", "мультфильм");
    Movie movie7 = new Movie(7, "Номер один", "комедия");

    @Test
    public void getNameTest() {
        Manager manager = new Manager();
        manager.addMovie(movie1);

        assertEquals("Бладшот", movie1.getMovieName());
    }

}
