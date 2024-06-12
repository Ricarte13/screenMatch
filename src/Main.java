//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "Die hard";
        myMovie.releaseYear = 1990;
        myMovie.durationInMinutes = 180;

        myMovie.displayTechnicalSheet();
        myMovie.evaluate(8);
        myMovie.evaluate(9);
        myMovie.evaluate(7);
        myMovie.evaluate(8);

        System.out.println(myMovie.avaliation);
        System.out.println(myMovie.totalAvaliation);
        System.out.println(myMovie.takeAverage());

    }
}