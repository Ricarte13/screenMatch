public class Movie {
    String name;
    int releaseYear;
    boolean includedInThePlan;
    double avaliation;
    int totalAvaliation;
    int durationInMinutes;

    void displayTechnicalSheet() {
        System.out.println(name);
        System.out.println(releaseYear);
    }

    void evaluate(double note) {
        avaliation += note;
        totalAvaliation++;
    }

    Double takeAverage() {
        return avaliation / totalAvaliation;
    }

}
