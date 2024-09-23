import br.com.alura.screenMatch.calculations.RecomendationsFilter;
import br.com.alura.screenMatch.model.Episode;
import br.com.alura.screenMatch.model.Movie;
import br.com.alura.screenMatch.model.Serie;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Die hard");
        myMovie.setReleaseYear(1990);
        myMovie.setDurationInMinutes(180);
        myMovie.setIncludedInThePlan(true);

        myMovie.displayTechnicalSheet();
        myMovie.evaluate(3);
        myMovie.evaluate(6);
        myMovie.evaluate(7);
        myMovie.evaluate(8);

        System.out.println("Average movie ratings: " + myMovie.takeAverage());
        System.out.println("**************************************");

        Serie serie = new Serie();
        serie.setName("The Office");
        serie.setSeasons(9);
        serie.setEpisodesPerSeason(20);
        serie.setMinutesPerEpisodes(21);
        serie.setReleaseYear(2004);
        serie.displayTechnicalSheet();
        System.out.printf("The time to marathon %s is %d%n", serie.getName(), serie.getDurationInMinutes());

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(serie);
        episode.setTotalVisualizations(130);

        RecomendationsFilter filter = new RecomendationsFilter();
        filter.filter(myMovie);
        filter.filter(episode);

        Movie newMovie = new Movie();
        newMovie.setName("Honey moon");
        newMovie.setReleaseYear(1990);
        newMovie.setDirector("Cumpadre Washington");

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(myMovie);
        movieList.add(newMovie);

        System.out.println();
        System.out.println("******************************");
        System.out.println(movieList);




    }
}