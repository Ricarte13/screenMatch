package br.com.alura.screenMatch.model;

public class Title {
    private String name;
    private int releaseYear;
    private boolean includedInThePlan;
    private double avaliation;
    private int totalAvaliation;
    private int durationInMinutes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public double getAvaliation() {
        return avaliation;
    }

    public int getTotalAvaliation() {
        return totalAvaliation;
    }

    public void displayTechnicalSheet() {
        System.out.println(name);
        System.out.println(releaseYear);
    }

    public void evaluate(double note) {
        avaliation += note;
        totalAvaliation++;
    }

    public Double takeAverage() {
        return avaliation / totalAvaliation;
    }

}
