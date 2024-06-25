package br.com.alura.screenMatch.model;

import br.com.alura.screenMatch.calculations.Classificable;

public class Movie extends Title implements Classificable {
    private String director;

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
}
