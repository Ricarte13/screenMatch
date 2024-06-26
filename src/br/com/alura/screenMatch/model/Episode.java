package br.com.alura.screenMatch.model;

import br.com.alura.screenMatch.calculations.Classificable;

public class Episode implements Classificable {

    private String name;
    private int number;
    private Serie serie;
    private int totalVisualizations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizations() {
        return totalVisualizations;
    }

    public void setTotalVisualizations(int totalVisualizations) {
        this.totalVisualizations = totalVisualizations;
    }

    @Override
    public int getClassification() {
        if (totalVisualizations > 100) {
            return 4;
        }else {
            return 2;
        }
    }
}
