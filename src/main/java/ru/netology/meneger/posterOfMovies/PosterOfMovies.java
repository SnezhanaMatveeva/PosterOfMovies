package ru.netology.meneger.posterOfMovies;

public class PosterOfMovies {

    private String[] names = new String[0];
    private int quantityOfLastFilms;

    public PosterOfMovies() {
        this.quantityOfLastFilms = 10;
    }

    public PosterOfMovies(int quantityOfLastFilms) {
        this.quantityOfLastFilms = quantityOfLastFilms;
    }


    public void add(String name) {
        String[] tmp = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            tmp[i] = names[i];
        }
        tmp[tmp.length - 1] = name;
        names = tmp;
    }


    public String[] findAll() {
        return names;
    }


    public String[] findLast() {
        int quantityOfmovies;
        if (names.length < quantityOfLastFilms) {
            quantityOfmovies = names.length;
        } else {
            quantityOfmovies = quantityOfLastFilms;
        }
        String[] lastMovies = new String[quantityOfmovies];
        for (int i = 0; i < quantityOfmovies; i++) {
            lastMovies[i] = names[names.length - 1 - i];
        }
        return lastMovies;
    }


  /*  public String[] getName() {
        return names;
    }

    public void setName(String[] name) {
        this.names = names;
    }

    public int getQuantityOfLastFilms() {
        return quantityOfLastFilms;
    }

    public void setQuantityOfLastFilms(int quantityOfLastFilms) {
        this.quantityOfLastFilms = quantityOfLastFilms;
    }
*/
}
