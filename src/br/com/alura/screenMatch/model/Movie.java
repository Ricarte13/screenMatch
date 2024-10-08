package br.com.alura.screenMatch.model;

import br.com.alura.screenMatch.calculations.Classificable;

public class Movie extends Title implements Classificable {
    private String director;

    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) (takeAverage() / 2);
    }

    @Override
    public String toString() {
        return "Movie: " +
                this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
