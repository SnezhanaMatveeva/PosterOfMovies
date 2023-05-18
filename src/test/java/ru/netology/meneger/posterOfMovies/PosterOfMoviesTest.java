package ru.netology.meneger.posterOfMovies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PosterOfMoviesTest {

    PosterOfMovies movies = new PosterOfMovies();

    @Test
    public void addTest() {
        movies.add("Номер один");
        movies.add("Отель Белград");
        movies.add("Джентельмены");
        movies.add("Вперед");
        String[] expected = {"Номер один", "Отель Белград", "Джентельмены", "Вперед"};
        String[] actual = movies.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addTestOneMovie() {
        movies.add("Вперед");
        String[] expected = {"Вперед"};
        String[] actual = movies.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addTestNoMovie() {
        String[] expected = {};
        String[] actual = movies.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast10Test() {
        movies.add("Фильм 1");
        movies.add("Фильм 2");
        movies.add("Фильм 3");
        movies.add("Фильм 4");
        movies.add("Фильм 5");
        movies.add("Фильм 6");
        movies.add("Фильм 7");
        movies.add("Фильм 8");
        movies.add("Фильм 9");
        movies.add("Фильм 10");
        movies.add("Фильм 11");
        movies.add("Фильм 12");
        String[] expected = {"Фильм 12", "Фильм 11", "Фильм 10", "Фильм 9", "Фильм 8", "Фильм 7", "Фильм 6", "Фильм 5", "Фильм 4", "Фильм 3"};
        String[] actual = movies.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        movies.add("Фильм 1");
        movies.add("Фильм 2");
        movies.add("Фильм 3");
        movies.add("Фильм 4");
        String[] expected = {"Фильм 4", "Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = movies.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLastLimitTest() {
        PosterOfMovies movies1 = new PosterOfMovies(5);
        movies.add("Фильм 1");
        movies.add("Фильм 2");
        movies.add("Фильм 3");
        movies.add("Фильм 4");
        movies.add("Фильм 5");
        String[] expected = {"Фильм 5", "Фильм 4", "Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = movies.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}